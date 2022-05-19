
/**
 * Write a description of class Demo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demo
{
    public static void dameUnNumero(int n){
        
    }
    public static void main(String args[]){
        int n = 10;
        for(int i=0;i<n;i++){ // i=i+1 o i+=1
            System.out.println("Adios");
        }
        
        int contador=0;
        while(contador<n){
            System.out.println("Hola");
            contador++;
            if (contador>5){
                break;
            }
        }
        
        int aux = 0;
        do{
            System.out.println("Ok");
            aux++;
        }while(false);
        
        System.out.println("termine");

    }
}
