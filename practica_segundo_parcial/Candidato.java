public class Candidato{
    int identificador;
    String nombre;
    public Candidato(int identificador, String nombre){
        this.identificador=identificador;
        this.nombre=nombre;
    }
    public String toString(){
        return this.nombre;
    }
}