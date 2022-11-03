package evaluacion_unidad_ii;

/**
 * @authors
 * José Sebastian López Ibarra
 * Sebastián Emilio Murillo Andrade
 * Andrés Saen Olivas
 * Domingo 30 de Octubre de 2022
 */

public class ArbolBinario {
    private Nodo raiz;
    private Lista ListaInOrder;
    
    public ArbolBinario() {
        this.raiz = null;
        ListaInOrder = new Lista();
    }        
        
    // Método para el usuario
    public void insertar(String contenido) {
        if (raiz == null) { // Si es nulo, se inserta un nodo en la raíz
           raiz = new Nodo(contenido);
        } else { // Si no, se llama al método agregar
            agregarRecur(contenido, raiz); 
        }
    }        
    
    // Método recursivo add
    // Requiere dos parámetros: una cadena y el nodo actual
    private void agregarRecur(String contenido, Nodo nodoActual) {
        
        Nodo newNode = new Nodo(contenido);                
        
        if (contenido.compareToIgnoreCase(nodoActual.getContenido()) == 0) { // Las dos palabras son iguales
            System.out.println("El elemento está repetido");            
        } else if (contenido.compareToIgnoreCase(nodoActual.getContenido()) < 0) { // La palabra va antes alfabéticamente
            if (nodoActual.getIzquierda() == null) {
                nodoActual.setIzquierda(newNode);
            } else {
                agregarRecur(contenido, nodoActual.getIzquierda());
            }            
        } else if (contenido.compareToIgnoreCase(nodoActual.getContenido()) > 0) { // La palabra va después alfabéticamente
            if (nodoActual.getDerecha()== null) {
                nodoActual.setDerecha(newNode);
            } else {
                agregarRecur(contenido, nodoActual.getDerecha());
            } 
        }
    }
    
    // Método In Order
    // Método público (para el usuario)
    public void inOrder() {
        System.out.println("\nÁrbol binario In Order:");
        inOrderRecur(raiz);
        System.out.println("");
    }
    
    // Método privado recursivo
    private void inOrderRecur(Nodo nodoActual) {        
        if (nodoActual != null) {
            inOrderRecur(nodoActual.getIzquierda());
            System.out.print(nodoActual.getContenido() + " ");
            ListaInOrder.agregar(nodoActual.getContenido());
            inOrderRecur(nodoActual.getDerecha());
        }
    }
    
    // Método Post Order
    // Método público (para el usuario)
    public void postOrder() {
        System.out.println("\nÁrbol binario Post Order:");
        postOrderRecur(raiz);
        System.out.println("");
    }
    
    // Método privado recursivo
    private void postOrderRecur(Nodo nodoActual) {        
        if (nodoActual != null) {
            postOrderRecur(nodoActual.getIzquierda());
            postOrderRecur(nodoActual.getDerecha());
            System.out.print(nodoActual.getContenido() + " ");
        }
    }
    
    // Método Pre Order 
    // Método público (para el usuario)
    public void preOrder() {
        System.out.println("\nÁrbol binario Pre Order:");
        preOrderRecur(raiz);
        System.out.println("");
    }
    
    // Método privado recursivo
    private void preOrderRecur(Nodo nodoActual) {        
        if (nodoActual != null) {
            System.out.print(nodoActual.getContenido() + " ");
            preOrderRecur(nodoActual.getIzquierda());
            preOrderRecur(nodoActual.getDerecha());
        }
    }
    //Obtenemos la lista
    public Lista getInOrderList(){
        return ListaInOrder;
    }
}
