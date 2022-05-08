public class VideoJuego
{
    public String nombre;
    public double minVelocidad;
    public int minHilos;
    public int minRAM;
    public int minGPU;
    
    public VideoJuego(String nombre, double minVelocidad, int minHilos, int minRAM, int minGPU) {
        this.nombre = nombre;
        this.minVelocidad = minVelocidad;
        this.minHilos = minHilos;
        this.minRAM = minRAM;
        this.minGPU = minGPU;
    }
}
