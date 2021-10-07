
package Class;


public class Profesor extends Personas {
    
    private String area;
        
    /**
     * 
     * @param nombre Nombre del profesor.
     * @param apellido Apellido del profesor.
     * @param genero Genero del profesor.
     * @param fnacimiento Fecha de nacimiento del profesor. 
     * @param estatura Estatura del profesor.
     * @param peso  Peso del profesor.
     */
    public Profesor(String nombre, String apellido, Character genero,
            String fnacimiento, int estatura, int peso){
        
        super(nombre, apellido, genero, fnacimiento, estatura, peso);
    
    }
        
    /**
     * Regresa el area de estudio del profesor
     * 
     * @return area
     */
    public String getArea(){
        return this.area;
    }
    
    /**
     * setArea
     * Establece el area de estudio del profesor
     * @param area 
     */
    public void setArea(String area){
        this.area=area;
    }
    
}
