package Class;

public class Personas {

    private String nombre;
    private String apellido;
    private Character genero;
    private String fnacimiento;
    private int estatura;
    private int peso;
    

    /**
     * Persona
     * Al momento de inicializar la clase, es obligacion inicializar sus
     * atributos
     * 
     * @param nombre Nombre de la Persona.
     * @param apellido Apellido de la Persona.
     * @param genero Genero de la Persona.
     * @param fnacimiento Fecha Nacimiento de la Persona.
     * @param estatura Estatura de la Persona.
     * @param peso Peso de la Persona.
     */
    public Personas(String nombre, String apellido, Character genero,
            String fnacimiento,int estatura,int peso ) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
        this.fnacimiento=fnacimiento;
        this.estatura=estatura;
        this.peso=peso;
    }
    
    public Personas(){
        
    }

    /**
     * getNombre
     *
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setNombre
     *
     * @param nombre Nombre Persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getApellido
     *
     * @return Apellido de la Persona.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido Apellido de la Persona.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * getGenero
     *
     * @return Genero de la persona.
     */
    public Character getGenero() {
        return genero;
    }
    
    /**
     * setGenero
     * 
     * @param genero Genero de la Persona. 
     */
    public void setGenero(Character genero) {
        this.genero = genero;
    }

    /**
     * getFnacimiento.
     *
     * @return Fecha de nacimiento de la persona.
     */
    public String getFnacimiento() {
        return fnacimiento;
    }
    
    /**
     * setFnacimiento
     * 
     * @param fnacimiento Fecha nacimiento de la Persona. 
     */
    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }
    
    /**
     * setEstatura
     * 
     * @param estatura Estatura de la Persona.
     */
    public void setEstatura(int estatura){
        this.estatura=estatura;
    }
    
    /**
     * getEstatura
     * 
     * @return Estatura de la Persona. 
     */
    public int getEstatura(){
        return this.estatura;
    }
    
    /**
     * setPeso
     * 
     * @param peso Peso de la Persona. 
     */
    public void setPeso(int peso){
        this.peso=peso;
    }
    
    /**
     * getPeso
     * 
     * @return Peso de la Persona. 
     */
    public int getPeso(){
        return this.peso;
    }

}