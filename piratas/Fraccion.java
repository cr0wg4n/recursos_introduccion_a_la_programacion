public class Fraccion {
    int denominador;
    int numerador;
    
    public Fraccion (int denominador, int numerador) {
        this.numerador = numerador; // arriba
        this.denominador = denominador; // abajo
    }
    
    public int mostrarNumerador () {
        return this.numerador;
    }
    public int mostrarDenominador () {
        return this.denominador;
    }
    public int calcular () {
        if (this.denominador < this.numerador) {
            return 0;
        } 
        return this.numerador / this.denominador;
    }
}