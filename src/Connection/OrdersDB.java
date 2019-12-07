package Connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ProyectoRancho17.*;

public class OrdersDB {

    Connection cnx = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    //Show all orders  
    public ArrayList<Compra_17> ListOrders() throws ClassNotFoundException {
        ArrayList<Compra_17> cli = new ArrayList<>();
        try {
            cnx = DBConnection.getConnecction();
            st = cnx.createStatement();
            rs = st.executeQuery("SELECT cliente_17.id_cliente, cliente_17.nombre_cliente, producto_17.id_producto, producto_por_distribuidor_17.nombre_producto, compra_17.cantidad, \n"
                    + "distribuidor_17.nombre_distribuidor, compra_17.no_orden, compra_17.fecha_de_compra"
                    + " FROM distribuidor_17 inner join producto_por_distribuidor_17 on distribuidor_17.id_distribuidor = producto_por_distribuidor_17.id_distribuidor\n"
                    + "inner join producto_17 on producto_17.id_distribuidor = producto_por_distribuidor_17.id_distribuidor inner join\n"
                    + "compra_17 on compra_17.id_producto = producto_17.id_producto inner join cliente_17 on compra_17.id_cliente = cliente_17.id_cliente\n"
                    + "order by 1");
            while (rs.next()) {
                Compra_17 c = new Compra_17();

                c.setClient_id(rs.getInt(1));
                c.setClient_name(rs.getString(2));
                c.setProduct_ID(rs.getInt(3));
                c.setName_product(rs.getString(4));
                c.setCantidad(rs.getInt(5));
                c.setName_distribuitor(rs.getString(6));
                c.setNo_orden(rs.getString(7));
                c.setFecha_de_compra(rs.getDate(8));
                cli.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        DBConnection.close(cnx);
        return cli;
    }
    
    
     public void delete(String id) {
        try {
            cnx = DBConnection.getConnecction();
            pst = cnx.prepareStatement("DELETE FROM COMPRA_17 "
                    + " WHERE NO_ORDEN=?");
            pst.setString(1, id);
            pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        DBConnection.close(cnx);
    }

     
     
     public void InsertInto(Compra_17 comp) {

        try {
            cnx = DBConnection.getConnecction();
            pst = cnx.prepareStatement("INSERT INTO compra_17("
                    + " no_orden,fecha_de_compra,cantidad,id_producto,id_cliente) "
                    + "VALUES(?,?,?,?,?)");
            pst.setString(1, comp.getNo_orden());
            pst.setDate(2, comp.getFecha_de_compra());
            pst.setInt(3, comp.getCantidad());
            pst.setInt(4, comp.getProduct_ID());
            pst.setInt(5, comp.getClient_id());
            pst.executeQuery();
   
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DBConnection.close(cnx);
    }
     
     
         public Compra_17 findOrder(String no_orden) {
        Compra_17 c = null;
        
        long id = Long.parseLong(no_orden);
        try {
            cnx = DBConnection.getConnecction();
            st = cnx.createStatement();
            rs = st.executeQuery("SELECT compra_17.no_orden, compra_17.fecha_de_compra, compra_17.cantidad, compra_17.id_producto, compra_17.id_cliente, cliente_17.nombre_cliente, producto_por_distribuidor_17.nombre_producto,\n" +
                        "distribuidor_17.nombre_distribuidor"
                    + " FROM compra_17 inner join cliente_17 on compra_17.id_cliente = cliente_17.id_cliente\n" +
                    "inner join producto_17 on compra_17.id_producto = producto_17.id_producto \n" +
                    "inner join distribuidor_17 on producto_17.id_distribuidor = distribuidor_17.id_distribuidor\n" +
                    "inner join producto_por_distribuidor_17 on producto_17.id_distribuidor = producto_por_distribuidor_17.id_distribuidor "
                    + " WHERE no_orden="+id+"");
            while (rs.next()) {
                c = new Compra_17();
                
                c.setNo_orden(rs.getString(1));
                c.setFecha_de_compra(rs.getDate(2));
                c.setCantidad(rs.getInt(3));
                c.setProduct_ID(rs.getInt(4));
                c.setClient_id(rs.getInt(5));
                c.setClient_name(rs.getString(6));
                c.setProduct_name(rs.getString(7));
                c.setName_distribuitor(rs.getString(8));
                
            
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        DBConnection.close(cnx);
        return c;
    }
    
     
     
     
     
     
     
}
