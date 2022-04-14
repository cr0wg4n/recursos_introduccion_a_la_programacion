public class Robot {
    String modelo;int edad;
    
    public Robot() {
        this.modelo = "RX-T12";
    }
    
    public void hacerCalculos() {
        Calculadora calcu = new Calculadora();
        double calculo = calcu.sumar(13423.0, 4534.2);
        System.out.println(calculo);
        
        calculo = calcu.multiplicar(33443.23, 903401.2);
        System.out.println(calculo);
        
        System.out.println(calcu.obtenerMemoria());
    }
}