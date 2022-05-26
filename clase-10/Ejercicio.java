public class Ejercicio{
    public int factorial(int n){
        int aux = 1;
        for(int i=1;i<=n;i++){
            aux = aux * i;
        }
        return aux;
    }
    public double raizCuadrada2(int n){
        double raiz=1;
        double error=0.00000000001;
        boolean bandera=true;
        
        while(bandera){
            double nuevaRaiz=0.5*(raiz+(n/raiz));
            if(Math.abs(nuevaRaiz-raiz)<error){
                bandera=false;
            }
            System.out.println(raiz);
            raiz=nuevaRaiz;
        }
        return raiz;
    }
}