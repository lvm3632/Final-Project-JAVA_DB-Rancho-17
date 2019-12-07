/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoRancho17;

import java.sql.Date;

/**
 *
 * @author a01636172
 */
public class Producto_17 {

    private  int product_id;
    private String description, distribuitor, product_name;
    private double price_per_unit;
    
    private Distribuidor_17 dis = new Distribuidor_17();
    
    private producto_por_distribuidor_17  ppd = new producto_por_distribuidor_17();
   

    public Producto_17() {

    }

    public Producto_17(int product_id, String description, String distribuitor, String product_name, double price_per_unit) {
        this.product_id = product_id;
        this.description = description;
        this.distribuitor = distribuitor;
        this.product_name = product_name;
        this.price_per_unit = price_per_unit;
    }
    

    public int getProduct_id() {
        return product_id;
    }
    
    
    public void setFecha_de_entrega(Date fecha_de_entrega ){
        ppd.setFecha_de_entrega(fecha_de_entrega);
    }
    
    public Date getFecha_de_entrega(){
        return ppd.getFecha_de_entrega();
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDistribuitor() {
        return distribuitor;
    }

    public void setDistribuitor(String distribuitor) {
        this.distribuitor = distribuitor;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    
    public void setID_Distribuitor(int distribuitor_id){
        dis.setId_distribuidor(distribuitor_id);
    }
    
    public int getID_Distribuitor(){
        return dis.getId_distribuidor();
    }
    
    public void setTelephone_distribuitor(String telephone){
        dis.setTelefono_distribuidor(telephone);
    }
    public String getTelephone_distribuitor(){
        return dis.getTelefono_distribuidor();
    }

    
    
    public void setName_Distribuitor(String name_distribuitor){
        dis.setNombre_distribuidor(name_distribuitor);
    }
    
    public String getName_Distribuitor(){
        return dis.getNombre_distribuidor();   
    }
    
    public double getPrice_per_unit() {
        return price_per_unit;
    }

    public void setPrice_per_unit(double price_per_unit) {
        this.price_per_unit = price_per_unit;
    }

}
