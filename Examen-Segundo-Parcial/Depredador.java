public class Depredador{
    String nombre;
    int[][] huella;
    public Depredador(String nombre, int[][] huella){
        this.nombre = nombre;
        this.huella = huella;
    }
    public int tamanioHuella(){
        return this.huella.length;
    }
    public int[][] rotarHuella(int[][] huella, String direccion){
        int[][] res = new int[huella.length][huella.length];
        if(direccion.equals("NORTE")){
            res=huella;
        }else if(direccion.equals("ESTE")){
            res=this.girarHuellaDerecha(huella);
        } else if(direccion.equals("SUD")){
            res=this.girarHuellaDerecha(this.girarHuellaDerecha(huella));
        } else if(direccion.equals("OESTE")){
            res=this.girarHuellaDerecha(this.girarHuellaDerecha(this.girarHuellaDerecha(huella)));
        }
        return res;
    }
    
    private int[][] girarHuellaDerecha(int[][] huella){
        int[][] res = new int[huella.length][huella.length];
        for(int i=0;i<huella.length;i++){
            for(int j=0;j<huella.length;j++){
                res[j][(huella.length-1)-i]=huella[i][j];
            }
        }
        return res;
    }
}