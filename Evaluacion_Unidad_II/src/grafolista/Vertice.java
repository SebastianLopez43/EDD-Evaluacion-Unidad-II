package grafolista;
import java.util.LinkedList;

/**
 * @authors
 * José Sebastian López Ibarra
 * Sebastián Emilio Murillo Andrade
 * Andrés Saen Olivas
 * Domingo 30 de Octubre de 2022
 */

public class Vertice {
    String nombre; 
    int numVertice; 
    LinkedList<Object> lad;
    
    public Vertice(String x){ 
        nombre = x; 
        numVertice = -1; 
        lad = new LinkedList();
    } 
    
    public boolean equals(Object d) { // true, si dos vértices son iguales 
        Vertice dos = (Vertice) d;    
        return nombre.equals(dos.nombre); 
    } 
    
    public void asigVert(int n){ // establece el número de vértices
        numVertice = n; 
    }
    
    public String nomVertice(){ // devuelve identificador del vértice
            return nombre; 
    } 
    public String toString(){ // Caracteristicas del vértice
            return nombre + " (" + numVertice + ")";
    }
}