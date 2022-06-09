public class Personaje{
    int ataque; // 0-10  10/100 = 0.10     1 - 0.10 = 0.80 * 11 = 8.8
    int defensa;
    double vida;

    public Personaje(int ataque, int defensa, double vida){
        this.ataque=ataque;
        this.defensa=defensa;
        this.vida=vida;
    }
    
    public double danioAtaque(){
        double ataque = this.ataque * Math.random();
        return ataque;
    }
    
    public void causarDanio(double danio){
        this.vida = this.vida - (danio*(1-this.defensa/100));
    }
    
    public boolean estaMuerto(){
        if(this.vida<=0){
            return true;
        }else{
            return false;
        }
    }
    public void obtenerCaracteristicas(){
        System.out.println("ataque: "+this.ataque+ " - defensa: "+this.defensa+" - vida: "+this.vida);
    }
}