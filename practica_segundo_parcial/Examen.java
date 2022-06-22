import java.util.ArrayList;

public class Examen{
    public void arraylistEnArrayList(){
        ArrayList<ArrayList<ArrayList<ArrayList<Examen>>>> arr = new ArrayList<>();
        
    }
    public void maderitas(){
        char[][] maderas = {
            {'-','-','-','-','-','|','|','|','|','-','-','-',},
            {'-','-','-','-','-','|','|','|','|','-','-','-',},
            {'|','|','|','|','-','-','|','|','-','-','-','|',},
            {'|','|','|','|','-','-','-','-','|','|','|','|',},
            {'-','-','-','|','-','-','|','|','|','|','|','|',},
            {'-','-','-','|','|','|','|','|','|','|','-','-',},
        };
        int horizontales=0;
        for(int i=0; i<maderas.length; i++){
            char maderaAntigua=' ';
            for(int j=0; j<maderas[i].length; j++){
                char madera=maderas[i][j];
                if(madera!=maderaAntigua && madera=='-'){
                    horizontales++;
                }
                maderaAntigua=madera;
                System.out.print(madera);
            }
            System.out.println();
        }
        
        
        System.out.println();
        System.out.println();
        int verticales=0;
        for(int i=0; i<maderas[0].length; i++){
            char maderaAntigua = ' ';
            for(int j=0; j<maderas.length; j++){
                char madera=maderas[j][i];
                if(madera!=maderaAntigua && madera=='|'){
                    verticales++;
                }
                maderaAntigua=madera;
                System.out.print(madera);
            }
            System.out.println();
        }
        
        
        System.out.println("verticales: "+verticales);
        System.out.println("horizontales: "+horizontales);
    }
}