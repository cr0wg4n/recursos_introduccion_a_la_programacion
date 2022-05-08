public class Main
{
    public static void main(String args[]){
        Cpu cpu = new Cpu(5.1, 12); // AMD
        Ram ram1 = new Ram(4);
        Ram ram2 = new Ram(4);
        Gpu gpu = new Gpu(6);
        
        TarjetaMadre tarjetaMadre = new TarjetaMadre("ASUS");
        
        tarjetaMadre.agregarCPU(cpu);
        tarjetaMadre.agregarGPU(gpu);
        tarjetaMadre.agregarRam1(ram1);
        tarjetaMadre.agregarRam2(ram2);
        tarjetaMadre.mostrarCaracteristicas();
        
        VideoJuego fornite = new VideoJuego("fornite",3.5,4,6,2);
        
        tarjetaMadre.agregarVideojuego(fornite);
        if (tarjetaMadre.comprobarVideojuego()) {
            System.out.println("Ejecutando videojuego... "+tarjetaMadre.videojuego.nombre);
        } else {
            System.out.println("Juego imposible de ejecutar");
        }
        
        
        
        tarjetaMadre.cpu.incrementarFuncionalidad();
        
        tarjetaMadre.mostrarCaracteristicas();
        
        System.out.println("_____________________");
    }
}
