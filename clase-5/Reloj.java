public class Reloj {
    int horaActual; // 12 horas (1 - 12)
    int minutoActual; // 60 minutos (0 - 59)
    
    public Reloj() {
        this.horaActual = 12;
        this.minutoActual = 0;
    }
    
    public void incrementarMinuto () {
        this.minutoActual = this.minutoActual + 20;
        if (this.minutoActual > 59) {
            this.incrementarHora();
            this.minutoActual = 0;
        }
    }
    
    public void incrementarHora () {
        this.horaActual = this.horaActual + 1;
        if (this.horaActual > 12) {
            this.horaActual = 1;
        }
    } 
    
    public void decrementarMinuto () {
        this.minutoActual = this.minutoActual - 20;
        if (this.minutoActual < 0) {
            this.minutoActual = 59;
            this.decrementarHora();
        }
    }
    
    public void decrementarHora () {
        this.horaActual = this.horaActual - 1;
        if (this.horaActual < 1) {
            this.horaActual = 12;
        }
    }
}