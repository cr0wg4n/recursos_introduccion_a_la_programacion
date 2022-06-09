public class Dado{
    public int lanzar(){
        int dado=(int) (Math.random()*6) +1;
        return dado;
    }
}