
/**
 * Modela elementos que representan objetos a utilizar.
 */

public class Elemento {
    private final Integer peso;
    private final String nombre;

    /**
     * Construye un objeto de tipo elemento con un nombre a eleccion
     * y el peso correspondiente.
     * 
     * @param nombre El nombre del elemento.
     * @param peso El peso del elemento.
     */
    public Elemento (String nombre, Integer peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    /**
     * Devuelve el peso del elemento.
     * 
     * @return El peso del elemento.
     */
    public Integer getPeso() {
        return peso;
    }

    /**
     * Devuelve el nombre del elemento.
     * 
     * @return El nombre del elemento.
     */
    public String getNombre() {
        return nombre;
    }

     /**
     * Devuelve el elemento como texto.
     * 
     * @return El texto que representa al elemento.
     */
    @Override
    public String toString() {
        return nombre;
    }

}