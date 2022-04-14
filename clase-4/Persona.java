public class Persona {
    String nombre;
    int edad;
    
    public Persona() {
        this.nombre = "Juanito";
        this.edad = 17;
    }
    
    public void hacerCalculos() {
        Calculadora calcu = new Calculadora();
        double calculo = calcu.sumar(123.0, 45.2);
        System.out.println(calculo);
        
        calculo = calcu.multiplicar(343.23, 9001.2);
        System.out.println(calculo);
        
        System.out.println(calcu.obtenerMemoria());
    }
}