public class Matematicas {
    public void llamarPI(){
        System.out.println(Math.PI);
    }
    public void utilitarios () {
        double cuadrado = Math.pow(2,12);
        //System.out.println(cuadrado);
        
        double raiz = Math.sqrt(9);
        // System.out.println(raiz);
        
        double min = Math.min(2,3);
        // System.out.println(min);
        
        double max = Math.max(10,232323);
        // System.out.println(max);
        
        double random = Math.random() * 90;
        // System.out.println(random);
        
        double redondearNumero = Math.round(50.2);
        // System.out.println(redondearNumero);
        
        double logBase10 = Math.log10(100);
        // System.out.println(logBase10);
        
        double absoluto = Math.abs(-10.2);
        //System.out.println(absoluto);
        
        int parteEntera = (int) 10.8;
        System.out.println(parteEntera);
    }
}