public class Calculadora {
    String modelo;
    String marca;
    double memoria;
    
    public Calculadora(){
        this.modelo = "SXD1212";
        this.marca = "Casio";
        this.memoria = 0.0;
    }
    
    public double sumar(double a, double b) {
        double operacion =  a + b;
        this.memoria = operacion;
        return operacion;
    }
    
    public double multiplicar(double a, double b){
        double operacion = a * b;
        this.memoria = operacion;
        return operacion;
    }
    
    public double obtenerMemoria(){
        return this.memoria;
    }
}