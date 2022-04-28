public class Calcular {
    public boolean calcular(int numeroTel) {
        // 4444440
        int numDigitos = (int)Math.log10(numeroTel) + 1;
        
        int numeroInicial = (int) (numeroTel / Math.pow(10, numDigitos - 1));
        
        System.out.println(numeroInicial);
        return false;
    }
}