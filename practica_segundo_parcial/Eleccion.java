import java.util.ArrayList;

public class Eleccion{
    ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
    ArrayList<Candidato>[] boletas;
    public Eleccion(){
        candidatos.add(new Candidato(1,"John Doe"));
        candidatos.add(new Candidato(2,"Jane Smith"));
        candidatos.add(new Candidato(3,"Jane Austen"));
        boletas = generarBoletas();
    }
    
    public void identificarGanador(){
        ArrayList<Candidato> c = new ArrayList<Candidato>();
        for(int i=0; i< this.boletas.length; i++){
            Candidato candidato = this.boletas[i].get(0);
            c.add(candidato);
        }
        
        
    }
    
    public ArrayList<Candidato>[] generarBoletas(){
        ArrayList<Candidato>[] boletas = new ArrayList[5];
        ArrayList<Candidato> a = new ArrayList<Candidato>();
        a.add(this.candidatos.get(0));
        a.add(this.candidatos.get(1));
        a.add(this.candidatos.get(2));
        boletas[0]=a;
        
        ArrayList<Candidato> b = new ArrayList<Candidato>();
        b.add(this.candidatos.get(1));
        b.add(this.candidatos.get(0));
        b.add(this.candidatos.get(2));
        boletas[1]=b;

        
        ArrayList<Candidato> c = new ArrayList<Candidato>();
        c.add(this.candidatos.get(1));
        c.add(this.candidatos.get(2));
        c.add(this.candidatos.get(0));
        boletas[2]=c;
        
        
        ArrayList<Candidato> d = new ArrayList<Candidato>();
        d.add(this.candidatos.get(0));
        d.add(this.candidatos.get(1));
        d.add(this.candidatos.get(2));
        boletas[3]=d;
        
        
        ArrayList<Candidato> e = new ArrayList<Candidato>();
        e.add(this.candidatos.get(2));
        e.add(this.candidatos.get(0));
        e.add(this.candidatos.get(1));
        boletas[4]=e;
        return boletas;
    }
}