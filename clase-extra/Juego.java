// Juego para lanzar un dado (1 - 6) y 
// que en función al dado hagamos operaciones matemáticas
public class Juego{
    public void jugar(int n){
        int puntos=0;
        for(int i=0;i<n;i++){
            Dado claseDado=new Dado();
            
            int dado=claseDado.lanzar();
            if(dado==1){
                puntos=puntos + dado*50;
            } else if (dado==2){
                puntos=puntos + dado*dado;
            } else if (dado==6) {
                puntos=puntos+100;
            } else {
                puntos = puntos - 100;
            }
            System.out.println("dado: "+dado);
        }
        if(puntos<0){
            System.out.println("Perdiste el juego");
        }else{
            System.out.println("Ganaste el juego");
        }
        System.out.println("puntos: "+puntos);
    }
}