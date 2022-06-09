/**
 * Cerradura de rueditas
 * 
 * @author Vladimir Costas
 * @version 20140409vcj
 */
public class Lock{
    private int numero;
    private int clave;
    
    public Lock(){
        numero = 111;
        clave  = 111;
    }
    
    public Lock(int numero){
        this.numero = numero; 
        if ( hayCero(numero) )
        {
            this.numero = 111;
            clave       = 111;
        }else
        {
            clave = numero;
        }
    }
       
    public int getNumero(){
        return numero;
    }
    
    private boolean hayCero(int n){
        int     residuo;
        boolean hayCero;
        
        hayCero = false;

        
        residuo = n % 10;
        n       = n / 10;
        
        while (n != 0 && residuo != 0) 
        {
            residuo = n % 10; 
            n       = n /10;
        }
        
        hayCero = residuo == 0;
        
        return hayCero;
    }
    
    public void moverArribaRuedita( int numRueda){
        int num = numero;
        int digito;
        
        for (int i = 1; i < numRueda; i++)
        {
            num = num / 10;
        }
        
        digito = num % 10;
        
        if (digito+1 > 9  )
        {
            moverArribaRuedita(numRueda, (digito - 1) * (-1));
            
        } else 
        {
            moverArribaRuedita(numRueda, 1);
        }        
    }

    private void moverArribaRuedita( int numRueda, int operando){
        
        for (int i = 1; i < numRueda; i++)
        {
            operando = operando * 10; // 100
        }
    
        numero = numero + operando;
    }

    
    public void moverAbajoRuedita(int numRueda)
    {
        int num = numero;
        int digito;
        for (int i = 1; i < numRueda; i++){
                num = num / 10;
        }
        digito = num % 10;
        
        if(digito-1 < 1){
            moverAbajoRuedita(numRueda,(9-digito) * -1);
        }else{
            moverAbajoRuedita(numRueda,1);
        }
    }

    
    private void moverAbajoRuedita( int numRueda, int operando){
        for (int i = 1; i < numRueda; i++)
        {
            operando = operando * 10;
        }
        
        numero = numero - operando;
    }
    
    
    public boolean estaAbierto()
    {
        boolean abierta = numero == clave;
        
        return abierta;
    }
    
    
    public void ponerClave(int nuevaClave)
    {
        
    }
    
    private int numDigitos( int num){
        int numDigitos = 0;
        
        do {
            num = num /10;
            numDigitos++;
        } while (num > 0);
        
        return numDigitos;
    }
    
    
}
