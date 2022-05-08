public class TarjetaMadre {
    public Cpu cpu;
    private Ram ram1;
    private Ram ram2;
    private Gpu gpu;
    private String marca;
    public VideoJuego videojuego;
    
    public TarjetaMadre(String marca) {
        this.marca = marca;
    }
    
    public void agregarVideojuego(VideoJuego videojuego){
        this.videojuego = videojuego;
    }
    
    public void agregarCPU(Cpu cpu) {
        this.cpu = cpu;
    }
    
    public void agregarGPU(Gpu gpu) {
        this.gpu = gpu;
    }
    
    public void agregarRam1(Ram ram1) {
        this.ram1 = ram1;
    }
    
    public void agregarRam2(Ram ram2) {
        this.ram2 = ram2;
    }
    
    public int totalRam () {
        return this.ram1.memoria + this.ram2.memoria;
    }
    
    public void mostrarCaracteristicas() {
        System.out.println("Marca tarjeta madre: "+this.marca);
        System.out.println("Tengo CPU (hilos): "+this.cpu.obtenerHilos());
        System.out.println("Tengo CPU (velocidad): "+this.cpu.obtenerVelocidad());
        System.out.println("Tengo RAM (GB): "+ this.totalRam());
        System.out.println("Tengo GPU (GB): "+ this.gpu.memoria);
    }
    
    public boolean comprobarVideojuego(){
        if (this.cpu.obtenerVelocidad()>=this.videojuego.minVelocidad 
            && this.cpu.obtenerHilos()>=this.videojuego.minHilos
            && this.gpu.memoria>=this.videojuego.minGPU
            && this.totalRam()>=this.videojuego.minRAM
        ) {
            return true;
        }
        return false;
    }
    
    
    
    
    
    
    
    
    
    
}