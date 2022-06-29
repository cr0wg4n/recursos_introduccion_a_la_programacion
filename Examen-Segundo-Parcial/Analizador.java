import java.util.ArrayList;

public class Analizador{
    public void analizar(){
        int[][] huella={
            {0,0,0,0},
            {0,1,1,1},
            {0,1,0,1},
            {0,1,1,1},
        };
        int[][] img={
            {0,0,0,0,0,1,0,0,0,0},
            {0,1,1,1,0,1,1,1,1,0},
            {0,1,0,1,1,1,1,0,1,0},
            {0,1,1,1,0,1,1,1,1,0},
            {1,1,0,1,0,0,1,1,1,0},
            {0,1,0,0,0,0,0,0,1,0},
            {1,1,0,0,1,1,1,1,1,0},
            {0,0,0,0,1,0,1,1,0,0},
            {1,1,1,0,1,1,1,0,0,1},
            {0,0,1,0,1,0,0,0,1,1}
        };
        Imagen imagen = new Imagen(img);
        Depredador ptacho = new Depredador("Ptacho",huella);
        
        //huella = ptacho.rotarHuella(huella,"OESTE");
        //this.mostrarMatriz(huella);
        ArrayList<Coordenada> coordenadas = new ArrayList<Coordenada>();
        for(int i=0;i<imagen.area.length;i++){
            for(int j=0;j<imagen.area.length;j++){
                int tamanioHuella = ptacho.tamanioHuella();
                int [][] sospechaHuella = new int[tamanioHuella][tamanioHuella];
                if(imagen.area.length-i >= tamanioHuella && imagen.area.length-j>= tamanioHuella){
                    for(int x=i; x<imagen.area.length && x < i + tamanioHuella ; x++){
                        for(int y=j; y<imagen.area.length && y < j + tamanioHuella ; y++){
                            sospechaHuella[x-i][y-j] = imagen.area[x][y];
                        }
                    }
                }
                if(this.compararMatrices(sospechaHuella, ptacho.rotarHuella(ptacho.huella, "NORTE"))){
                    coordenadas.add(new Coordenada(i,j,"NORTE"));
                } else if(this.compararMatrices(sospechaHuella, ptacho.rotarHuella(ptacho.huella, "ESTE"))){
                    coordenadas.add(new Coordenada(i,j,"ESTE"));
                } else if(this.compararMatrices(sospechaHuella, ptacho.rotarHuella(ptacho.huella, "SUD"))){
                    coordenadas.add(new Coordenada(i,j,"SUD"));
                } else if(this.compararMatrices(sospechaHuella, ptacho.rotarHuella(ptacho.huella, "OESTE"))){
                    coordenadas.add(new Coordenada(i,j,"OESTE"));
                }
            }
        }
        System.out.println(coordenadas);
    }
    
    public boolean compararMatrices(int[][] matrizA, int[][] matrizB){
        boolean res=true;
        for(int i=0;i<matrizA.length;i++){
            for(int j=0;j<matrizA.length;j++){
                if(matrizA[i][j]!=matrizB[i][j]){
                    return false;
                }
            }
        }
        return res;
    }
    
    public void mostrarMatriz(int[][] huella){
        for(int i=0;i<huella.length;i++){
            for(int j=0;j<huella.length;j++){
               System.out.print(huella[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}