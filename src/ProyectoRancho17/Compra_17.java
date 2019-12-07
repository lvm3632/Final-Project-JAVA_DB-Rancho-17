
package ProyectoRancho17;

import java.sql.Date;


public class Compra_17 {
    
    

       private int cantidad;
    Date fecha_de_compra;
    String no_orden;

    private Cliente_17 cl = new Cliente_17();
    private Distribuidor_17 dis = new Distribuidor_17();
    private Producto_17 pr = new Producto_17();
    private producto_por_distribuidor_17 pr_d = new producto_por_distribuidor_17();
    
    
  /*  public Compra_17(int no_orden, int cantidad, Date fecha_de_compra) {
        this.no_orden = no_orden;
        this.cantidad = cantidad;
        this.fecha_de_compra = fecha_de_compra;
    }*/
    
    public Compra_17(String no_orden, Date fecha_de_compra, int cantidad, int product_id, int client_id){
        this.no_orden = no_orden;
        this.fecha_de_compra = fecha_de_compra;
        this.cantidad = cantidad;
        this.setProduct_ID(product_id);
        this.setClient_id(client_id);
         
    }

 
    

    
    public Compra_17(){
        
    }
    
    public void setProduct_name(String name_product){
        pr_d.setNombre_producto(name_product);
    }
    
    public String getProduct_name(){
        return pr_d.getNombre_producto();
    }
    
    
    public void setClient_id(int id){
       cl.setId_cliente(id);
    }
    
   
    
    public void setClient_name(String name){
    
        cl.setNombre_cliente(name);
    }

    public Compra_17(Cliente_17 cl) {
        this.cl = cl;
    }
    
    
    public void setProduct_ID(int id_product){
        pr.setProduct_id(id_product);
    }
    
    public int getProduct_ID(){
        return pr.getProduct_id();
    }
    
    public void setName_product(String product_name){
        pr.setProduct_name(product_name);
    }
    
    public String getName_product(){
        return pr.getProduct_name();
    }
    
    public int getClient_id(){
        return cl.getId_cliente();
    }
    
    public String getClient_name(){
        return cl.getNombre_cliente();
    }
    
    
    public void setId_distribuitor(int id){
        dis.setId_distribuidor(id);
    }
    
    public int getId_distribuitor(){
        return dis.getId_distribuidor();
    }
    
    public void setName_distribuitor(String name_distributor){
        dis.setNombre_distribuidor(name_distributor);
    }
    
    public String getName_distribuitor(){
        return dis.getNombre_distribuidor();
    }
    
    
   
    
    public String getNo_orden() {
        return no_orden;
    }

    public void setNo_orden(String no_orden) {
        this.no_orden = no_orden;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha_de_compra() {
        return fecha_de_compra;
    }

    public void setFecha_de_compra(Date fecha_de_compra) {
        this.fecha_de_compra = fecha_de_compra;
    }
    
    
    
    
    
    
    
    
}
