
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
        public static void imprimirGusanoSimple(int t) {
            String cabeza = "(^__^)";
            String cola = "( _)";
            
            System.out.print(cabeza);
            for (int i = 1;i<=t;i++) {          // i++   son iguales i=i+1 son iguales i+=5
               String cuerpo = "(.."+i+"..)";
               System.out.print(cuerpo);
            }
            System.out.println(cola);
        }
        public static void imprimirGusanoSimpleConConcatenacion(int t) {
            String cabeza = "(^__^)";
            String cola = "( _)";
            String cuerpo = "";
            for (int i = 1;i<=t;i++) {          // i++   son iguales i=i+1 son iguales i+=5
               cuerpo = cuerpo + "(.." + i + "..)";
            }
            String gusano = cabeza + cuerpo + cola;
            System.out.println(gusano);
        }
        public static void imprimirGusanoManchoso(int t, int m) {
           String cabeza = "(^__^)";
           String cola = "( _)";
           String cuerpo = "";     
           for (int i=0;i<t;i=i+1) {
                String manchas="";
                for (int j=0;j<m;j++){
                    manchas = manchas + ".";
                }
                cuerpo += "(" + manchas + ")";
           }
            String gusano = cabeza + cuerpo + cola;
            System.out.println(gusano);
        }
        public static void main() {
            //imprimirGusanoSimple(1000);
            //imprimirGusanoSimpleConConcatenacion(100);
            //imprimirGusanoManchoso(100,10);
            int n = 100;
            int i = 1;
            while (i < n) {
                if(i%2==0) {
                    System.out.println("par -> i:"+i);
                } else {
                    System.out.println("impar -> i:"+i);
                }
                if (i%15==0) {
                    continue;
                }
                i++;
            }        
        }
}