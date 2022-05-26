public class Main{
    public static void main(String[] args){
        int[] arregloEnteros = {1, 2, 6, 24, 3674};
                            //  0  1  2   3    4
                            
        //System.out.println(arregloEnteros[4]);
        
        char[] arregloCaracteres = {'h', 'o', 'l', 'a', 's', '\n', 'x'};
                                //   0    1    2    3    4    // tamaño=5
                                
        int tamanioArreglo = arregloCaracteres.length;
        
        for(int i=0;i<tamanioArreglo;i++){
            System.out.print(arregloCaracteres[i]);
        }
        
        
        double[] arregloDouble = new double[10];
        
        arregloDouble[9]=0.99; 
        arregloDouble[5]=0.1; 
        
        for(int i=0;i<arregloDouble.length;i++){
            System.out.println(arregloDouble[i]);
        }
        
        int i =0;
        while(i<arregloCaracteres.length){
            System.out.print(arregloCaracteres[i]);
            i++;
        }
        
    }
}