public class Barco
{
    int nroLiberarDeSaqueadores = 0;
    int esfuerzoLiberarDeSaqueadores = 15;
    int precioLiberarDeSaqueadores = 3050;
    
    int nroBuscarDesaparecidos = 0;
    int esfuerzoBuscarDesaparecidos = 8;
    int precioBuscarDesaparecidos = 2000;
    
    int nroRecolectarAlimentos = 0;
    int esfuerzoRecolectarAlimentos = 4;
    int precioRecolectarAlimentos = 1050;
    
    int nroTripulantes = 5;
    int totalGanado = 0;
    int totalGastado = 0;
    
    public Barco (int nroLiberarDeSaqueadores,int nroBuscarDesaparecidos, int nroRecolectarAlimentos) {
        this.nroLiberarDeSaqueadores = nroLiberarDeSaqueadores;
        this.nroBuscarDesaparecidos = nroBuscarDesaparecidos;
        this.nroRecolectarAlimentos = nroRecolectarAlimentos;
    }
    
    public int calcularEsfuerzo() {
        int formulaEsfuerzo = this.nroLiberarDeSaqueadores * this.esfuerzoLiberarDeSaqueadores +
        this.nroBuscarDesaparecidos * this.esfuerzoBuscarDesaparecidos +
        this.nroRecolectarAlimentos * esfuerzoRecolectarAlimentos;
        return formulaEsfuerzo;
    }
    
    // cara => true
    // cruz => false
    public boolean lanzarMoneda() {
        // 0.0 a 1.0     -> 0.50
        boolean moneda = Math.random() < 0.50;
        if (moneda) {
            System.out.println("salio cara");
        } else {
            System.out.println("salio cruz");
        }
        return moneda;
    }
    
    public int lanzarDado () {
        int dado = (int) (Math.random() * 6 + 1);
        return dado;
    }
    
    public void calcularGanancias () {
        this.totalGanado = this.nroBuscarDesaparecidos * this.precioBuscarDesaparecidos +
        this.nroLiberarDeSaqueadores * this.precioLiberarDeSaqueadores +
        this.nroRecolectarAlimentos * this.precioRecolectarAlimentos - this.totalGastado;
    }
    public void agregarNuevoMiembro() {
        boolean moneda = this.lanzarMoneda();
        if (moneda == true) {
            this.nroTripulantes = this.nroTripulantes + 1;
            if (this.nroTripulantes % 2 == 0) {
                int dado = this.lanzarDado();
                System.out.println("Dado: " + dado);
                // if (dado>=1 && dado <= 2) {
                if (dado == 1 || dado == 2) {
                    System.out.println("todos bailan");
                } else if (dado == 3) {
                    int incremento = 500;
                    this.precioBuscarDesaparecidos = this.precioBuscarDesaparecidos + incremento;
                    this.precioLiberarDeSaqueadores += incremento;
                    this.precioRecolectarAlimentos += incremento;
                    System.out.println("Se incrementaron los precios");
                } else if (dado == 4) {
                    this.nroTripulantes = this.nroTripulantes - 1;
                    System.out.println("Se fue un tripulante a explorar");
                    if (this.nroTripulantes <= 0) {
                        this.nroTripulantes = 0;
                        System.out.println("El barco se pone triste");
                    }
                } else if (dado == 5 || dado == 6) {
                    int costoJugoCoco = 1250 * this.nroTripulantes;
                    this.totalGastado = this.totalGastado + costoJugoCoco;
                    this.calcularGanancias();
                    System.out.println("Se compraron jugos de coco, se gasto: "+ costoJugoCoco);
                }
            }
        } else {
            System.out.println("El nuevo postulante no pudo ingresar");
        }
    }
}
