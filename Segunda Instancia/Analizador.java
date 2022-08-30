import java.util.ArrayList;


public class Analizador
{
    ArrayList<Tupla> tuplas = new ArrayList();
    public Analizador(){
        this.tuplas.add(new Tupla("hola",4));
        this.tuplas.add(new Tupla("cruel",16));
        this.tuplas.add(new Tupla("mundo",10));
        this.tuplas.add(new Tupla("nuestro",26));
        this.tuplas.add(new Tupla("el",22));
        this.tuplas.add(new Tupla("como",20));
    }
    public int[] ordenador(){
        int aux;
        int[] A = {10,20,50,1,7}; // {1,7,10,20,50}
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {                                                              
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
        return A;
    }
    public ArrayList<Tupla> ordenadorDeTuplas(){
        int aux;
        String auxPalabra;
        ArrayList<Tupla> tuplas=this.tuplas;
        for (int i = 0; i < tuplas.size() - 1; i++) {
            for (int j = 0; j < tuplas.size() - i - 1; j++) {                                                              
                if (tuplas.get(j + 1).indice < tuplas.get(j).indice) {
                    aux = tuplas.get(j + 1).indice;
                    auxPalabra = tuplas.get(j+1).palabra;
                    tuplas.get(j + 1).indice = tuplas.get(j).indice;
                    tuplas.get(j + 1).palabra = tuplas.get(j).palabra;
                    tuplas.get(j).indice = aux;
                    tuplas.get(j).palabra = auxPalabra;
                }
            }
        }
        return tuplas;
    }
}
