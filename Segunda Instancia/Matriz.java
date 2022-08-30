import java.util.*;

public class Matriz
{
   public void preparar(){
       ArrayList<String> demo= new ArrayList();
       demo.add("asdasd");
       this.main(demo);
       
       
    }
   public void main(ArrayList<String> demo){
        int[][] matriz = {
            {1,1,1,1},
            {2,2,2,2},
            {3,3,3,3},
            {4,4,4,4}
        };
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j]);
            }
        }
    }
    public void splitExperimento(){
        String[] palabras = {
            "hola mundo cruel",
            "sabias que tengo",
            "habia una vez",
            "solias visitarme antes"
        };
        for(int i=0; i < palabras.length; i++){
            String[] resSplit = palabras[i].split(" ");
            for(int j=0; j < resSplit.length; j++){
                System.out.print(resSplit[j]+ " ");
            }
            System.out.println();
        }
    }
}
