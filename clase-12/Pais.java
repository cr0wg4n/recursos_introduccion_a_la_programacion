public class Pais{
    private String nombre;
    private int poblacion;
    private int reservasMonetarias;
    
    public Pais(String nombre, int poblacion, int reservasMoneratias){
        this.nombre=nombre;
        this.poblacion=poblacion;
        this.reservasMonetarias=reservasMoneratias;
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
    
    public int obtenerPoblacion(){
        return this.poblacion;
    }
    
    public int obtenerReservasMonetarias(){
        return this.reservasMonetarias;
    }
    
    public String toString(){
        return this.nombre;
    }
}