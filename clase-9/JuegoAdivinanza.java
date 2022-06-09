
/**
 * Write a description of class JuegoAdivinanza here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class JuegoAdivinanza
{
    private int nroTurnos = 0;
    private int nroAdivinanza = 0;
    
    public JuegoAdivinanza(int nroTurnos){
        this.nroTurnos = nroTurnos;
    }
    public int obtenerNumeroAlAzar() {
        return (int)((Math.random()*100) +1);
    }
    public int pedirEntrada(){
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        return entrada;
    }
    public void jugar() {
        this.nroAdivinanza = this.obtenerNumeroAlAzar();
        System.out.println("Bienvenid@ al juego!");
        int turnos = 0;
        
        while(true) {
            turnos = turnos + 1;
            System.out.println("* Turno: "+turnos);
            System.out.println("introduce un numero entre el 0 - 100:");
            int respuesta = this.pedirEntrada();
            if(!(respuesta>=0 && respuesta<=100)) {
                System.out.println("> tu número es invalido");
                turnos=turnos-1;
                continue;
            }
            if(turnos <= this.nroTurnos) {
                if(respuesta < this.nroAdivinanza) {
                    System.out.println("tu número es menor");
                    continue;
                } else if (respuesta > this.nroAdivinanza) {
                    System.out.println("tu número es mayor");
                    continue;
                } else if (respuesta == this.nroAdivinanza) {
                    System.out.println("Ganaste!!!");
                    break;
                }
            } else {
                System.out.println("Perdiste!!!");
                break;
            }
        }
        System.out.println("Termino el juego, el numero era: "+this.nroAdivinanza);
    }
}
