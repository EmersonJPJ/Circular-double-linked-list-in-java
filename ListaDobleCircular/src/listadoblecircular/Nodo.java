
package listadoblecircular;

/**
 *
 * @author EMERSON
 */
public class Nodo {
    private Curso elemento;
    private Nodo siguiente;
    private Nodo anterior;
    
    public Nodo(){
        this.siguiente=null;
        this.anterior=null;
    }
 
    /**
     * @return the elemento
     */
    public Curso getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Curso elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    
}
