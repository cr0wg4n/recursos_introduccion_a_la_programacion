
/**
 * Write a description of class Iteraciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Iteraciones
{
    public void mostrarFormula(int n){
        int b = 1;
        String c = "";
        String sumas = "";
        for (int i = 1; i <= n; i++){
            int a = 1;
            c = "";
            while(a<=b){
                if(a == 1){
                    c = "1";
                    a++;
                }
                else{
                    c = c + "+" + a;
                    a++;
                }
            }
            if(i < n){
              sumas = sumas + "(" + c + ")x";  
            }
            else{
                sumas = sumas + "(" + c + ")";
            }
            b++;
        }
        System.out.println("T=" + sumas);
    }
    
    public int operacion(int n){
        int resultado = 1;
        int b = 1;
        for (int i = 1; i <= n; i++){
            int a = 1;
            int c = 0;
            while(a<=b){
                    c +=a;
                    a++;
            }
            b++;
            resultado = resultado * c;
        }
        return resultado;
    }
}
