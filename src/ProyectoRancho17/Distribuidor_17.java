
package ProyectoRancho17;


public class Distribuidor_17 {
    
    private int id_distribuidor;
    String nombre_distribuidor,
           telefono_distribuidor;

    
    public Distribuidor_17(){
        
    }
    
    
    public Distribuidor_17(int id_distribuidor, String nombre_distribuidor, String telefono_distribuidor) {
        this.id_distribuidor = id_distribuidor;
        this.nombre_distribuidor = nombre_distribuidor;
        this.telefono_distribuidor = telefono_distribuidor;
    }

    public int getId_distribuidor() {
        return id_distribuidor;
    }

    public void setId_distribuidor(int id_distribuidor) {
        this.id_distribuidor = id_distribuidor;
    }

    public String getNombre_distribuidor() {
        return nombre_distribuidor;
    }

    public void setNombre_distribuidor(String nombre_distribuidor) {
        this.nombre_distribuidor = nombre_distribuidor;
    }

    public String getTelefono_distribuidor() {
        return telefono_distribuidor;
    }

    public void setTelefono_distribuidor(String telefono_distribuidor) {
        this.telefono_distribuidor = telefono_distribuidor;
    }
    
    
    
    
    
    
    
    
    
    
}
