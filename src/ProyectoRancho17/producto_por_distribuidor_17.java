
package ProyectoRancho17;

import java.sql.Date;




public class producto_por_distribuidor_17 {

    
    private Distribuidor_17 dis;
    private String nombre_producto,
                   descripcion;
    private float precio;
    Date fecha_de_entrega;

    
    public int getId_distribuidor(){
        return dis.getId_distribuidor();
    }
    
    public void setId_distribuidor(int id){
        dis.setId_distribuidor(id);
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getFecha_de_entrega() {
        return fecha_de_entrega;
    }

    public void setFecha_de_entrega(Date fecha_de_entrega) {
        this.fecha_de_entrega = fecha_de_entrega;
    }
    
    
}
