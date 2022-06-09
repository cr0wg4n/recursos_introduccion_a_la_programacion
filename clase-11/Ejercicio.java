public class Ejercicio{
    public void ejercicio1(){
        String cadena = "No, . . . . . . # @nos atrevemos a muchas cosas porque son difíciles, pero son difíciles porque no nos atrevemos a hacerlas";
        char[] arreglo = cadena.toCharArray();
        System.out.println(arreglo[5]);
    }
    public int contadorLetras(String cadena,char letra){
        int contador=0;
        char[] caracteres = cadena.toCharArray();

        for(int i=0;i<caracteres.length;i++){
            System.out.println(caracteres[i]);
            if(letra==caracteres[i]){
                contador++;
            }
        }
        return contador;
    }
}