public class Planeta{
    private String nombre="";
    private long distanciaAlSol=0l;
    
    public Planeta(String nombre, long distanciaAlSol){
        this.nombre=nombre;
        this.distanciaAlSol=distanciaAlSol;
    }
    
    public long obtenerDistanciaAlSol(){
        return this.distanciaAlSol;
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
}