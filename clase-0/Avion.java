public class Avion {
    int numAsientos;
    String modelo;
    String linea;
    int numTurbinas;
    int numVentanas;
    int numAsafatas;
    double velocidadMaxima;
    double velocidadMinima;
    
    double velocidadProm;
    
    public Avion (int numAsientos, String modelo, String linea) {
        this.numAsientos = numAsientos;
        this.modelo = modelo;
        this.linea = linea;
        
        this.numTurbinas = 12;
        this.numVentanas = 40;
        this.numAsafatas = 3;
        
        this.velocidadMaxima = 1300;
        this.velocidadMinima = 1120;
        
    }
    
    public double calcularVelocidad(double constanteFriccion) {
        double formulaVelocidad = (this.velocidadMinima + this.velocidadMaxima)/2 * constanteFriccion;
        return formulaVelocidad;
    }
    
    public void volar(){
        System.out.println("Avion volando");
    }
    
    public void maniobraDePlaneacion() {
        System.out.println("Planeando");
    }
    

    
    public void ponerVelocidadMaxima (double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public void ponerVelocidadMinima (double velocidadMinima) {
        this.velocidadMinima = velocidadMinima;
    }
}
