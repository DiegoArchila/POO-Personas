package Class;
       
import java.util.Random;

public class Profesores {
    
    private int sizeArray=50;
    private String[] areas;
    
    private Profesor[] listaProfesores;
    private PersonaRandom p=new PersonaRandom();
     
    public Profesores(){
        this.initAreas();
        
    }
    
    public Profesores(int sizeArray){
        this.initAreas();
        this.sizeArray=sizeArray;
    }
    
    /**
     * Crea la lista de profesores siguiendo el esquema. Personas.Profesor
     * y Profesores.Profesor
     * luego la imprime mostrando la lista de profesores con sus respectivos
     * datos y areas de estudio.
     */
    public void setProfesores(){
        
        listaProfesores = new Profesor[this.sizeArray];
        
        for (int i = 0; i < this.sizeArray; i++) {
            this.listaProfesores[i]=p.getPersonaRandom();
            this.listaProfesores[i].setArea(this.setProfesoresArea());
            
            System.out.print(this.listaProfesores[i].getNombre());
            System.out.print(" "+ this.listaProfesores[i].getApellido());
            System.out.print(", Genero:"+ this.listaProfesores[i].getGenero());
            System.out.print(", Fecha Nacimiento:"+ this.listaProfesores[i].getFnacimiento());
            System.out.print(", Estatura:"+ this.listaProfesores[i].getEstatura() + "CM");
            System.out.print(", Peso:"+ this.listaProfesores[i].getPeso() + "KG");
            System.out.print(", Area de Estudio:"+ this.listaProfesores[i].getArea());
            System.out.println("");
        }
        
    }
    
    /**
     * 
     * @return El area al azar. 
     */
    private String setProfesoresArea(){
        String area;
        int tAreas=this.areas.length;
        
        Random R = new Random();
        area=this.areas[R.nextInt(tAreas)];
        
        return area;
    }
    
    /**
    * initAreas
    * Inicializa las Aeras de estudio.
    */
    private void initAreas(){
        this.areas = new String[]{
            "Matematicas","Ciencias Naturales", "Fisica", "Filosofia", "Etica",
            "Religiones", "Arte", "Musica", "Astronomia"
        };
    }
     
    public int getSizeArray(){
        return this.sizeArray;
    }
}
