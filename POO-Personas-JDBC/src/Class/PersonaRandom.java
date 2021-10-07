
package Class;

import java.util.Random;
import java.util.Date;

/**
 *
 * @author diarchila
 */
public class PersonaRandom {
    
    private Random R = new Random();
    
    private String[] nMujeres; 
    private String[] nHombres; 
    private String[] nApellidos;
    
    private int minEdad=18,
                maxEdad=65,
                minPeso=45,
                maxPeso=120,
                minAltura=140,
                maxAltura=200;
    
    /**
     * Constructor
     */
    public PersonaRandom(){
        
        this.initNames();
        
    }
    
    /**
     * getPersonasRandom
     * Genera un Objeto Personas totalmente creado con datos Random.
     * NO CALCULE SI ES AÑO ES BISIESTO O NO, TENER ESTO EN CUENTA. NO CUENTO
     * CON MUCHO TIEMPO. SOLO POR LLENAR DATOS.
     * 
     * @return un Objeto Personas 
     */
    public Profesor getPersonaRandom(){
        
        
        String  nombre,
                apellido,
                fnacimiento;
        
        int altura,
            edad= this.getEdad(),    
            peso;
        
        Character genero;
        
        Profesor p;
        
        genero=this.getGenero(R.nextBoolean()); //Al Azar, hombre o mujer.
        nombre=this.getNombre(genero); //seleccinara un nombre dependiendo si es ->   
        apellido=this.getApellido();   //-> Hombre o mujer.  
        altura=this.getAltura();
        peso=this.getPeso();
        fnacimiento=this.getFechaNacimiento(edad); //REVISAR LOS COMENTARIOS
        
        p=new Profesor(nombre, apellido, genero, fnacimiento, altura, peso);
        
        return p;
    
    }
    
    /**
     * initNames
     * Inicializa las listas de nombres y apellidos.
     */
    private void initNames(){
    
        this.nApellidos = new String[]{"Arias", "Rodriguez", "Gomez", "Lopez", 
            "Gonzales", "Garcia", "Martinez", "Ramirez", "Sanchez", "Hernandez",
            "Diaz", "Perez", "Torres", "Rojas", "Vargas", "Navarro", "Campos",
            "Nives", "Montoya", "Moreno", "Guitierrez", "Jimenez", "Muñoz", "Castro",
            "Ortiz", "Alvarez", "Ruiz", "Suares", "Archila", "Meza", "Reyes",
            "Zambrano"};
        this.nMujeres=new String[]{"Ximena", "Sofia", "karla", "Andrea", "Ana",
            "Maria", "Camila", "Angela", "Xiomara", "Lupe", "Claudia", "Martha",
            "Julieta", "Dina", "Yudy"};
        this.nHombres=new String[] {"Diego", "Andres", "Blas", "Carlos", "Dionicio",
            "Antonio","Felipe", "Fernando", "Hernando", "Marcos", "Mario", 
            "Mathias", "Mateo", "Lucas", "Tomas"};
        
    }
    
    /**
     * getGenero
     * Si s = true el genero es Femenino 'F', en caso contrario
     * es Masculino 'M'.
     * 
     * @param s false or true.
     * @return El Genero
     */
    private Character getGenero(Boolean s){
                
        if (s){
            return 'F';
        }else{
            return 'M';
        }
       
    }
    
    /**
     * getNombre
     * Genera un nombre al azar, esto depedendiendo de las listas incluidas.
     * Generara un Nombre de una mujer si el parametro es 'F' o si es 'M' este
     * sera masculino.
     * 
     * @param g genero de una persona Femenimo 'F' o Masculino 'M'.
     * @return Nombre de una persona .
     */
    private String getNombre(Character g){
        
        if(g=='F'){
            return this.nMujeres[R.nextInt(this.nMujeres.length)];
        }else{
            return this.nHombres[R.nextInt(this.nHombres.length)];
        }
    }
    
    /**
     * getApellido
     * Genera el Apellido de una persona, no se tiene en cuenta si es
     * Mujer o Hombre.
     * 
     * @return Apellido de una Persona. 
     */
    private String getApellido(){
        return this.nApellidos[R.nextInt(this.nApellidos.length)];
    }
    
    /**
     * getEdad
     * Genera automaticamente la edad de una persona dentro de los ragos
     * establecidos por minEdad y MaxEdad.
     * 
     * @return Edad de una Persona. 
     */
    private int getEdad(){
       return (R.nextInt(this.maxEdad-this.minEdad))+this.minEdad;
    }
    
    /**
     * getPeso
     * Genera el peso de una persona al azar, esto dentro de los rangos minPeso
     * y maxPeso
     * 
     * @return La peso de una Persona. 
     */
    private int getPeso(){
        return (R.nextInt(this.maxPeso - this.minPeso))+this.minPeso;
    }
    
    /**
     * getAltura
     * Genera la altura de una persona al azar, esto dentro de los rangos
     * minAltura y maxAltura.
     * 
     * @return La altura de una Persona. 
     */
    private int getAltura(){
        return (R.nextInt(this.maxAltura-this.minAltura))+this.minAltura;
    }
    
    /**
     * getFechaNacimiento
     * Genera el dia y el mes de forma aleatoria. OJO, NO TENGO ENCUENTA SI EL
     * AÑO ES BISIESTO O NO, PARA CALCULAR LOS DIAS EN FEBRERO, PIDO DISCULPAS
     * POR ESTO. PERO, CASI NO TENGO TIEMPO.
     * 
     * @param edad edad de la persona.
     * @return la fecha de nacimiento.
     */
    private String getFechaNacimiento(int edad){
        
        Date y=new Date();
        
        StringBuilder f = new StringBuilder();
        f.append(R.nextInt(32 - 1) +1).append("/");
        f.append(R.nextInt(13-1)+1).append("/");
        f.append((y.getYear()+1900)- edad);
        
        return f.toString();
    }
}