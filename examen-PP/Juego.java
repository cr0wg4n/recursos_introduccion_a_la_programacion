public class Juego {
    int numeroObjetivo;
    int acumulado;
    String estado = "";
    String jugador = "";
    public Juego () {
        this.numeroObjetivo = (int)((Math.random()*50) + 10); // 10 y 60
    }
    public int incrementoComputadora() {  // 1 al 4
        return (int) ((Math.random() * 4)+ 1); 
    }
    public boolean ganador() {
         if (this.acumulado == this.numeroObjetivo) {
            this.estado += "El jugador "+this.jugador+" ha ganado! Juego Terminado! \n";
            return true;
        } else if (this.acumulado > this.numeroObjetivo) {
            this.estado += "Es un empate!!! \n";
            return true;
        }
        return false;
    }
    public String jugar (int incremento) { // 1 hasta 4
        // true or false, para true Humano, para false Computadora 
        this.jugarHumano(incremento);
        if(this.ganador() == false) {
            this.jugarComputadora();
            this.ganador();
            System.out.println(this.estado);
            return this.estado;
        } else {
            System.out.println(this.estado);
            return this.estado;
        }
    }
    public void jugarHumano(int incremento) {
        this.jugador = "Humano";
        this.acumulado = this.acumulado + incremento;
        this.estado += "Jugador "+jugador+" incrementa "+incremento+"      El numero acumulado es "+this.acumulado + "\n";
    }
    public void jugarComputadora(){
        this.jugador = "Computadora";
        int incrementoCompu = this.incrementoComputadora();
        this.acumulado += incrementoCompu;
        this.estado += "Jugador "+jugador+" incrementa "+incrementoCompu+"      El numero acumulado es "+this.acumulado + "\n";
    }
}