package grafo;

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
    
    public Vertice(String x){ 
        nombre = x; 
        numVertice = -1; 
    } 
    
    public String nomVertice(){ // devuelve identificador del vértice
            return nombre; 
    } 
    
    public boolean equals(Vertice n) { // true, si dos vértices son iguales 
            return nombre.equals(n.nombre); 
    } 
    
    public void asigVert(int n){ // establece el número de vértices
        numVertice = n; 
    }
    
    public String toString(){ // Caracteristicas del vértice
            return nombre + " (" + numVertice + ")";
    }
}
