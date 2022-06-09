public class Juego
{
    public void jugar(int n){
        Personaje[] personajes = new Personaje[n];
        for(int i = 0;i<n;i++){
            personajes[i] = new Personaje((int)(Math.random()*15),(int)(Math.random()*9),100);
        }
        while(this.condicionFinal(personajes)){
            int personaje1=(int)(Math.random()*n);
            int personaje2=(int)(Math.random()*n);
            if(personaje1!=personaje2){
                //Personaje p1 = personajes[personaje1];
                //Personaje p2 = personajes[personaje2];
                //p1.obtenerCaracteristicas();
                //p2.obtenerCaracteristicas();
                boolean turno=true;
                while(true){
                    if(turno){
                        double ataque = personajes[personaje1].danioAtaque();
                        personajes[personaje2].causarDanio(ataque);
                        System.out.println("Personaje 1 daña con:"+ataque+" a personaje 2   vida(personaje2): "+personajes[personaje2].vida);
                    }else{
                        double ataque = personajes[personaje2].danioAtaque();
                        personajes[personaje1].causarDanio(ataque);
                        System.out.println("Personaje 2 daña con:"+ataque+" a personaje 1   vida(personaje1): "+personajes[personaje1].vida);
                    }
                    if (personajes[personaje1].estaMuerto() || personajes[personaje2].estaMuerto()){
                        break;
                    }
                    turno=!turno;
                }
            }else {
                System.out.println("Mismo personaje no puede pelear");
            }
        }
    }    
    
    public boolean condicionFinal(Personaje[] personajes){
        boolean condicion=true;
        int contador=0;
        for(int i = 0;i<personajes.length;i++){
            if(!personajes[i].estaMuerto()){
                contador++;
            }
        }
        if(contador==1) {
            condicion=false;
        }
        return condicion;
    }
}
