public class Persona {
    int edad;
    String nombre;
    public Persona (String nombre) {
        this.edad = 0;
        this.nombre = nombre;
    }
    
    public void incrementarEdad() {
        this.edad = this.edad + 5;
    }
    
    public void mostrarEtapa() {
        
        if (this.edad >= 29) {
            System.out.println("Soy un adulto");
        } else if (this.edad >= 18) {
            System.out.println("Soy un joven");
        } else if (this.edad >= 15) {
            System.out.println("Soy un adolescente");
        } else if (this.edad >= 6) {
            System.out.println("Soy un niño");
        } else {
            System.out.println("Soy un bebe");
        }
        
        System.out.println("edad final: " + this.edad);
        /* if (this.edad >= 0 && this.edad <= 5) {
            System.out.println("Soy un bebe");
        } else if (this.edad >= 6 && this.edad <= 14) {
            System.out.println("Soy un niño");
        } else if (this.edad >= 15 && this.edad <= 17) {
            System.out.println("Soy un adolescente");
        } else if (this.edad >= 18 && this.edad <= 28) {
            System.out.println("Soy un joven");
        } else {
            System.out.println("Etapa desconocida");
        } */
        /*if (this.edad >= 0 && this.edad <= 5) {
            System.out.println("Soy un bebe");
        }
        
        if (this.edad >= 6 && this.edad <= 14) {
            System.out.println("Soy un niño");
        }
        
        if (this.edad >= 15 && this.edad <= 17) {
            System.out.println("Soy un adolescente");
        }*/
    }
}
        // 0 - 5 bebe
        // 6 - 14 niño
        // 15 - 17 adolescente
        // 18 - 28 joven
        // 29 - 52 adulto
        // 53 - N  adulto mayor
