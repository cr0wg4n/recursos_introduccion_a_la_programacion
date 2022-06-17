import java.util.ArrayList;

public class SistemaSolar
{
    private ArrayList<Planeta> planetas = new ArrayList<Planeta>();
    public SistemaSolar(){
        planetas.add(new Planeta("Sol",0L));
        planetas.add(new Planeta("Mercurio",57_910_000L));
        planetas.add(new Planeta("Venus",108_200_000L));
        planetas.add(new Planeta("Tierra",149_600_000L));
        planetas.add(new Planeta("Marte",227_940_000L));
        planetas.add(new Planeta("Jupiter",778_330_000L));
        planetas.add(new Planeta("Saturno",1_429_400_000L));
        planetas.add(new Planeta("Urano",2_870_990_000L));
        planetas.add(new Planeta("Neptuno",4_504_300_000L));
    }
    
    public long calcularDistanciaEntrePlanetas(Planeta a, Planeta b){
        long planetaADistancia = a.obtenerDistanciaAlSol();
        long planetaBDistancia = b.obtenerDistanciaAlSol();
        long distancia = planetaADistancia - planetaBDistancia;
        if(distancia<0){
            distancia=distancia*-1;
        }
        //distancia=Math.abs(distancia);
        return distancia;
    }
    
    public void tablaDeDistancias(){
        for(int i=0; i < this.planetas.size(); i++){
            Planeta planeta=this.planetas.get(i);
            for(int j=0; j < this.planetas.size(); j++){
                Planeta planeta2=this.planetas.get(j);
                if(!planeta.obtenerNombre().equals(planeta2.obtenerNombre())){
                    System.out.println("Planeta: "+planeta.obtenerNombre()+ " comparado con: "+planeta2.obtenerNombre());
                    long distancia = this.calcularDistanciaEntrePlanetas(planeta, planeta2);
                    System.out.println("Distancia es igual igual a: "+distancia);
                }
            }
            System.out.println("");
        }
    }
}
