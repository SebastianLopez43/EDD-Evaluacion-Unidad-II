package evaluacion_unidad_ii;

/**
 *
 * @author emiliomurillo
 */
public class NodoLista {
    private String valor;
    private NodoLista siguiente;

    //Por dafault, un nuevo nodo va al final de la lista
    //El final de la lista
    public NodoLista() {
        this.siguiente = null;
    }

    public NodoLista(String valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
