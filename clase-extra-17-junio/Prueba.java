public class Prueba{
    public void crearMatriz(){
        int[] arr = {1,2,3,4};
        //System.out.println(arr[0]);
        // NxN
        int[][] matriz = {
            {1,2,3,4,3232,32323,23,2323,322},
            {4,5,6,7,2332},
            {7,8,9,10},
            {2,3,4,25,2}
        };        
        
        for(int i=0;i<matriz[1].length;i++){
            //System.out.println(matriz[1][i]);
        }
        //  matriz[filas][columnas]
        int res=matriz[1][2];
        //System.out.println(res);
    
        for(int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=0;
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}