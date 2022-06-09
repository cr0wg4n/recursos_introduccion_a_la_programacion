import java.util.ArrayList;

public class Mundo
{
   private ArrayList<Pais> paises = new ArrayList<Pais>();

    public Mundo(){
        Pais bolivia = new Pais("Bolivia",12000000,676767);
        Pais chile = new Pais("Chile",22023010,4354545);
        Pais peru = new Pais("Peru",18023010,232323);
        Pais argentina = new Pais("Argentina",12323332,9797979);
        
        paises.add(argentina);
        paises.add(0, bolivia);
        paises.add(chile);
        paises.add(peru);
        paises.add(new Pais("Belgica",232323,232323));
    }
    
    public boolean estaVacio(){
        return this.paises.isEmpty();
    }
    
    public void eliminarPaises(){
        this.paises.clear();
    }

    public void eliminarPais(String nombre){
        for(int i = 0; i < this.paises.size(); i++) {
            if(this.paises.get(i).obtenerNombre().equals(nombre)){
                this.paises.remove(i);
            }
        }
    }
    
    public int contarPaises(){
        return this.paises.size();
    }
    
    public Pais paisMasRico(){
        int dinero=0;
        int posPaisRico=0;
        for(int i=0; i < this.paises.size(); i++){
            int dineroActual = this.paises.get(i).obtenerReservasMonetarias();
            if(dineroActual>dinero){
                dinero = dineroActual;
                posPaisRico = i;
            }
        }
        return this.paises.get(posPaisRico);
    }
    
    public void mostrarPaises(){
        for(int i=0;i<this.paises.size();i++){
            String nombrePais = this.paises.get(i).obtenerNombre();
            System.out.println(nombrePais);
        }
    }
}
