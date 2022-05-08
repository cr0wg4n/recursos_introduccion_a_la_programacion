public class Cpu {
    private double velocidad;
    private int hilos;
    public Cpu(double velocidad, int hilos){
        this.velocidad = velocidad;
        this.hilos = hilos;
    }
    
    public void incrementarFuncionalidad(){
        this.velocidad += 1; // son iguales: this.velocidad = this.velocidad + 1;
        this.hilos += 1;
    }
    
    public int obtenerHilos () {
        return this.hilos;
    }
    
    public double obtenerVelocidad() {
        return this.velocidad;
    }
}