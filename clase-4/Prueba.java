public class Prueba {
    public void soyAdulto(int edad) {
        Calculadora cal = new Calculadora();
        if(edad > 18){
            System.out.println("Soy un adulto");
        } else {
            System.out.println("Soy un adolescente");
        }
    }
}