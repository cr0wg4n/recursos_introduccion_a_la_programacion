
/**
 * Trufi.
 *
 * @author Vladimir
 * @version 20220414 vcj
 */
public class Trufi{
    private double recaudado;
    private int numeroAdultos; // 1.90 pasaje
    private int numeroUniversitarios; // 1 pasaje
    private int numeroEscolares; // 0.50 pasaje
    private int numeroGratis; // 0.00
    private int capacidadPasajeros;
    
    public Trufi(int capacidadPasajeros){
        recaudado = 0;
        numeroAdultos = 0;
        numeroUniversitarios = 0;
        numeroEscolares = 0;
        numeroGratis = 0;
        this.capacidadPasajeros = capacidadPasajeros;
    }
    
    /*  tipo pasajero
     * 'a' adulto
     * 'u' universitario
     * 'e' escolar
     * 'g' gratuito    
       */
    public void subirPasajeros(char tipoPasajero, int cantidad){
        if(this.contarPasajeros() < capacidadPasajeros ){
            // 40 - 30  = 4 >= 5
            // ¿hay espacio?
            // 5 >= 10 = false
            int espaciosLibres = (capacidadPasajeros - this.contarPasajeros());
            
            if (espaciosLibres >= cantidad)
            {
                if (tipoPasajero == 'a'){
                    recaudado = recaudado + 1.90 * cantidad;
                    numeroAdultos = numeroAdultos + cantidad;
                } else if (tipoPasajero == 'u'){
                    recaudado = recaudado +  1.00 * cantidad;
                    numeroUniversitarios = numeroUniversitarios + cantidad;            
                } else if (tipoPasajero == 'e') {
                    recaudado = recaudado +  0.50 * cantidad;
                    numeroEscolares = numeroEscolares + cantidad;
                } else if (tipoPasajero == 'g') {
                    numeroGratis = numeroGratis + cantidad;
                }// 1 completar para los otros tipos
            } else{
                // hay 10 libre     y 12 personas
                if (tipoPasajero == 'a'){
                    recaudado = recaudado + 1.90 * cantidad;
                    numeroAdultos = numeroAdultos + espaciosLibres;
                } else if (tipoPasajero == 'u'){       
                    recaudado = recaudado +  1.00 * cantidad;
                    numeroUniversitarios = numeroUniversitarios + espaciosLibres;     
                } else if (tipoPasajero == 'e') {
                    recaudado = recaudado +  0.50 * cantidad;
                    numeroEscolares = numeroEscolares + espaciosLibres;
                } else if (tipoPasajero == 'g') {
                    numeroGratis = numeroGratis + espaciosLibres;
                }// 1 completar para los otros tipos
                System.out.println("personas que no cosiguieron asiento "+ (cantidad - espaciosLibres));
                // 2 solo algunos podran subir
            }
        } else{
            System.out.println("Ya nadie puede subir al trufi se encuentra lleno con: " + this.contarPasajeros());
        }
    }

    public int contarPasajeros() {
        return numeroAdultos + numeroUniversitarios + numeroEscolares + numeroGratis;
    }
    
    public void bajarPasajeros(char tipoPasajero, int cantidad){
        if (tipoPasajero == 'a') {
             numeroAdultos = numeroAdultos - cantidad;
             numeroAdultos = this.controlarNegativos(numeroAdultos);
        } else if (tipoPasajero == 'u') {
            numeroUniversitarios = this.controlarNegativos(numeroUniversitarios - cantidad);
        } else if (tipoPasajero == 'e') {
            numeroEscolares = this.controlarNegativos(numeroEscolares - cantidad);
        } else if (tipoPasajero == 'g') {
            numeroGratis = this.controlarNegativos(numeroGratis - cantidad);
        }
    }
    public int controlarNegativos(int numero) {
        if (numero < 0) {
            return 0;
        } else {
            return numero;
        }
    }
    public double mostrarRecaudado () {
        return this.recaudado;
    }
}
