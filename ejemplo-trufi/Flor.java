public class Flor {
    int numeroPetalos;
    String color;
    String aroma;
    public Flor (String color,String aroma) {
        this.color = color;
        this.aroma = aroma;
        this.numeroPetalos = 10;
    }
    public Flor (String color) {
        this.color = color;
        this.aroma = "dulce";
        this.numeroPetalos = 10;
    }
    public void contarPetalos(){
        System.out.println("Tengo "+ this.numeroPetalos +" petalos");
    }
    public int contarPetalos(int tamanio) {
        return this.numeroPetalos;
    }
}

