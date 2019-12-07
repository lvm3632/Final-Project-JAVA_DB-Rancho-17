package Connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ProyectoRancho17.*;

public class ProductosDB {

    Connection cnx = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public ArrayList<Producto_17> ListProducts() throws ClassNotFoundException {
        ArrayList<Producto_17> productos = new ArrayList<>();
        try {
            cnx = DBConnection.getConnecction();
            st = cnx.createStatement();
            rs = st.executeQuery("SELECT producto_17.id_producto,producto_por_distribuidor_17.nombre_producto,distribuidor_17.nombre_distribuidor, producto_por_distribuidor_17.descripcion,  producto_por_distribuidor_17.precio, producto_por_distribuidor_17.id_distribuidor"
                    + " from producto_por_distribuidor_17 inner join distribuidor_17 on distribuidor_17.id_distribuidor = producto_por_distribuidor_17.id_distribuidor\n"
                    + "inner join producto_17 on producto_por_distribuidor_17.id_distribuidor = producto_17.id_distribuidor\n"
                    + "order by 1");
            while (rs.next()) {
                Producto_17 p = new Producto_17();

                p.setProduct_id(rs.getInt(1));
                p.setProduct_name(rs.getString(2));
                p.setDistribuitor(rs.getString(3));
                p.setDescription(rs.getString(4));
                p.setPrice_per_unit(rs.getDouble(5));
                p.setID_Distribuitor(rs.getInt(6));

                productos.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        DBConnection.close(cnx);
        return productos;
    }

    public Producto_17 findProduct(String id_producto) {
        Producto_17 p = null;

        
        
        int id = Integer.parseInt(id_producto);
        System.out.println(id);
        try {
            cnx = DBConnection.getConnecction();
            st = cnx.createStatement();
            rs = st.executeQuery("SELECT producto_17.id_producto,producto_por_distribuidor_17.nombre_producto,distribuidor_17.nombre_distribuidor, producto_por_distribuidor_17.descripcion,  producto_por_distribuidor_17.precio, producto_por_distribuidor_17.id_distribuidor"
                    + " FROM producto_por_distribuidor_17 inner join distribuidor_17 on distribuidor_17.id_distribuidor = producto_por_distribuidor_17.id_distribuidor\n"
                    + "inner join producto_17 on producto_por_distribuidor_17.id_distribuidor = producto_17.id_distribuidor "
                    + " WHERE producto_17.id_producto=" + id + "");
            while (rs.next()) {
                
                p = new Producto_17();
                p.setProduct_id(rs.getInt(1));
                p.setProduct_name(rs.getString(2));
                p.setDistribuitor(rs.getString(3));
                p.setDescription(rs.getString(4));
                p.setPrice_per_unit(rs.getDouble(5));
                p.setID_Distribuitor(rs.getInt(6));
               
            
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        DBConnection.close(cnx);
        return p;
    }
    
    
     public void delete(int id) {
        try {
            cnx = DBConnection.getConnecction();
            pst = cnx.prepareStatement("DELETE FROM Producto_17 "
                    + " WHERE id_producto=?");
            pst.setInt(1, id);
            pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ProductosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        DBConnection.close(cnx);
    }
     
     
     public void InsertIntoProducto(Producto_17 pr_17, Distribuidor_17 dis_17) {

        try {
            cnx = DBConnection.getConnecction();
            pst = cnx.prepareStatement("INSERT INTO distribuidor_17("
                    + " id_distribuidor, nombre_distribuidor,telefono_distribuidor ) "
                    + "VALUES(?,?,?)");
 

            pst.setInt(1, dis_17.getId_distribuidor());
            pst.setString(2, dis_17.getNombre_distribuidor());
            pst.setString(3, dis_17.getTelefono_distribuidor());
            
            pst.executeQuery();
            
            
            
              pst = cnx.prepareStatement("INSERT INTO producto_17("
                    + " id_producto, id_distribuidor ) "
                    + "VALUES(?,?)");
 

            pst.setInt(1, pr_17.getProduct_id());
            pst.setInt(2, dis_17.getId_distribuidor());
            pst.executeQuery();
          
            
            pst = cnx.prepareStatement("INSERT INTO producto_por_distribuidor_17("
                    + " id_distribuidor, nombre_producto, descripcion, precio, fecha_de_entrega) "
                    + "VALUES(?,?,?,?,?)");
             
           pst.setInt(1, dis_17.getId_distribuidor());
           pst.setString(2, pr_17.getProduct_name());
           pst.setString(3, pr_17.getDescription());
           pst.setDouble(4, pr_17.getPrice_per_unit());
           pst.setDate(5, pr_17.getFecha_de_entrega());
           pst.executeQuery();   
   
        } catch (SQLException ex) {
            Logger.getLogger(ProductosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DBConnection.close(cnx);
    }
     

}
