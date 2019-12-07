
package ProyectoRancho17;

public class Cliente_17 {
    
    private int id_cliente;
    private String nombre_cliente;
    private String apellido_cliente;
    private String direccion;
    private String correo;
    private String telefono;

    
    
    
    public Cliente_17(){
        
    }

    public Cliente_17(int id_cliente, String nombre_cliente, String apellido_cliente, String direccion, String correo, String telefono) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public Cliente_17(int id_cliente){
        this.id_cliente = id_cliente;
    }
    
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
    
}
