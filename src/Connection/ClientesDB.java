package Connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ProyectoRancho17.*;

public class ClientesDB {

    
   

    
    
    
    Connection cnx = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

//Show all clients  
    public ArrayList<Cliente_17> ListClients() throws ClassNotFoundException {
        ArrayList<Cliente_17> cli = new ArrayList<>();
        try {
            cnx = DBConnection.getConnecction();
            st = cnx.createStatement();
            rs = st.executeQuery("SELECT id_cliente,nombre_cliente,apellido_cliente,direccion,correo,telefono"
                    + " FROM cliente_17 ORDER BY 1");
            while (rs.next()) {
                Cliente_17 c = new Cliente_17();
                
                c.setId_cliente(rs.getInt(1));
                c.setNombre_cliente(rs.getString(2));
                c.setApellido_cliente(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setCorreo(rs.getString(5));
                c.setTelefono(rs.getString(6));
                
                cli.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        DBConnection.close(cnx);
        return cli;
    }

    //Find a client
    public Cliente_17 findClient(String id_cliente) {
        Cliente_17 c = null;
        
        int id = Integer.parseInt(id_cliente);
        try {
            cnx = DBConnection.getConnecction();
            st = cnx.createStatement();
            rs = st.executeQuery("SELECT id_cliente,nombre_cliente,apellido_cliente,direccion,correo,telefono"
                    + " FROM cliente_17 "
                    + " WHERE id_cliente="+id+"");
            while (rs.next()) {
                c = new Cliente_17();
                c.setId_cliente(rs.getInt(1));
                c.setNombre_cliente(rs.getString(2));
                c.setApellido_cliente(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setCorreo(rs.getString(5));
                c.setTelefono(rs.getString(6));

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        DBConnection.close(cnx);
        return c;
    }
    
      
    
    
    
     public void InsertInto(Cliente_17 cli) {

        try {
            cnx = DBConnection.getConnecction();
            pst = cnx.prepareStatement("INSERT INTO cliente_17("
                    + " id_cliente,nombre_cliente,apellido_cliente,direccion,correo,telefono ) "
                    + "VALUES(?,?,?,?,?,?)");
            pst.setInt(1, cli.getId_cliente());
            pst.setString(2, cli.getNombre_cliente());
            pst.setString(3, cli.getApellido_cliente());
            pst.setString(4, cli.getDireccion());
            pst.setString(5, cli.getCorreo());
            pst.setString(6, cli.getTelefono());
           
            pst.executeQuery();
   
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DBConnection.close(cnx);
    }
     
     
     public void delete(int id) {
        try {
            cnx = DBConnection.getConnecction();
            pst = cnx.prepareStatement("DELETE FROM CLIENTE_17 "
                    + " WHERE ID_CLIENTE=?");
            pst.setInt(1, id);
            pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        DBConnection.close(cnx);
    }

     public void Update(Cliente_17 cli) {
        try {
            cnx = DBConnection.getConnecction();
            pst = cnx.prepareStatement("UPDATE Cliente_17 SET "
                    + "ID_CLIENTE=?,NOMBRE_CLIENTE=?,APELLIDO_CLIENTE=?,DIRECCION=?,CORREO=?, TELEFONO=?"
                    + " WHERE ID_CLIENTE=?");
         
            pst.setInt(1, cli.getId_cliente());
            pst.setString(2, cli.getNombre_cliente());
            pst.setString(3, cli.getApellido_cliente());
            pst.setString(4, cli.getDireccion());
            pst.setString(5, cli.getCorreo());
            pst.setString(6, cli.getTelefono());
             pst.setInt(7, cli.getId_cliente());
           
          
            pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
         DBConnection.close(cnx);
    }
    
    
 
}
