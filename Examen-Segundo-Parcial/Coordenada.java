public class Coordenada{
    int x;
    int y;
    String orientacion;
    public Coordenada(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public Coordenada(int x, int y, String orientacion){
        this.x=x;
        this.y=y;
        this.orientacion=orientacion;
    }
    
    public String toString(){
        return "("+this.x+","+y+") en orientacion:"+this.orientacion;
    }
}