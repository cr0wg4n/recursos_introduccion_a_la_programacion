import java.util.ArrayList;

public class Curso
{
    // Es posible escribir la misma lista de ambas formas
    // ArrayList<Estudiante> lista = new ArrayList<>();
    ArrayList<Estudiante> lista = new ArrayList<Estudiante>();

    public Curso(){
        lista.add(new Estudiante("Juan Jose Condori", 20, 20));
        lista.add(new Estudiante("Noemi Garcia Flores", 18, 32));
        lista.add(new Estudiante("Juan Calle", 38, 32));
        lista.add(new Estudiante("Joaquin Bellido Dorado", 21, 43));
        lista.add(new Estudiante("Yusset Soria Milla", 17, 47));
        lista.add(new Estudiante("Edson Cañari Roman", 32, 90));
        lista.add(new Estudiante("Daniela Cardozo Zurita", 21, 22));
        lista.add(new Estudiante("Gerardo Somiel Franco", 25, 32));
        lista.add(new Estudiante("Nilda Mendoza Soledad", 18, 68));
        lista.add(new Estudiante("Marcelo Rocabado Bellido", 20, 78));
        lista.add(new Estudiante("Maria Rocha Rencio", 23, 98));
        lista.add(new Estudiante("Marco Ramirez Fajardo", 43, 18));
    }
    
    // Ejemplo: Obtener el total de estudiantes en el curso
    public int totalEstudiantes(){
        return this.lista.size();
    }
    
    // Ejemplo: Obtener una lista de estudiantes que coincidan con una determinada "nota" indicada
    public ArrayList<String> buscarNombredeEstudiantePorNotaPromedio(int nota){
        ArrayList<String> estudiantes = new ArrayList<>();
        for(int i=0; i<this.lista.size(); i++){
            Estudiante estudiante = this.lista.get(i);
            if(estudiante.notaPromedio==nota){
                estudiantes.add(estudiante.nombreCompleto);
            }
        }
        return estudiantes;
    } 
    
    // 1) ! Completar el siguiente método
    //      Duplicar las notas de todos los estudiantes
    //      Salida: lista de estudiantes con las notas duplicadas correctamente
    public void duplicarNotas(){
    }
    
    // 2) ! Completar el siguiente método
    //      Salida: devolver los "nombres" de los estudiantes aprobados en una lista (ArrayList de Strings)
    //      Nota: los aprobados superan la nota de 51
    public ArrayList<String> estudiantesAprobados(){
        
    }
    
    // 3) ! Completar el siguiente método
    //      Salida: devolver los "nombres" de los estudiantes reprobados en una lista (ArrayList de Strings)
    //      Nota: los reprobados no superan la nota de 51
    public ArrayList<String> estudiantesReprobados(){
        
    }
    
    // 4) ! Completar el siguiente método
    //      Salida: devolver a los estudiantes que apelliden "Bellido"
    //      Nota: los reprobados no superan la nota de 51
    public ArrayList<Estudiante> estudiantesApellido(){
        
    }
    
    // 5) ! Completar el siguiente método
    //      Clasifica a los estudiantes segun sus notas, crea una lista para cada categoria: 
    //      regular (entre 30 y 50), bueno (entre 51 y 80), excelente (entre 81 y 100)
    public void clasificarEstudiantes(){
    
    }
    
    // 6) ! Completar el siguiente método
    //      Calcula el promedio de las notas de todos los estudiantes
    //      Salida: un valor double con el promedio de notas
    public double calcularPromedioNotas(){
    
    }
    
    // 7) ! Completar el siguiente método
    //      Remueve de la lista a los estudiantes reprobados
    public void removerEstudiantesReprobados(){
    
    }
    
    // 8) ! Completar el siguiente método
    //      Calcular la edad promedio de los estudiantes en el curso
    public double calcularPromedioEdad(){
    
    }
    
    // 9) ! Completar el siguiente método
    //      Devolver una lista de los nombres que superen un entero "n" de tamaño,
    //      por ejemplo "Julian Soto Mayor" supera los 10 caracteres de tamanio
    public ArrayList<String> nombresPorTamanio(int n){
    
    }
    
    //10) ! Completar el siguiente método
    //      Devolver al estudiante con la mayor nota
    //      En caso de empate elegir cualquiera
    public Estudiante mejorEstudiante(){
    
    }
}
