package grafolista;

import java.util.LinkedList;

/**
 * @authors
 * José Sebastian López Ibarra
 * Sebastián Emilio Murillo Andrade
 * Andrés Saen Olivas
 * Domingo 30 de Octubre de 2022
 */
public class Grafo {
    int numVerts; 
    static int maxVerts = 20;
    Vertice [] tablAdc; 

    public Grafo(int mx){
        tablAdc = new Vertice[mx];
        numVerts = 0;
        maxVerts = mx;
    }
    
    public Grafo(){
        this(maxVerts);
    }

    public Vertice[] vertices(){
        return tablAdc;
    }
    //Devuelve la lista de adyacencia del vértice v
    public LinkedList listaAdyc(int v) throws Exception{
        if(v < 0 || v >= numVerts){
            throw new Exception("Vértice fuera de rango");
        }
        return tablAdc[v].lad;
    }
    // Busca y devuelve el número de vértice, si no lo encuentra regresa -1
    public int numVertice(String nombre){ 
            Vertice v = new Vertice(nombre); 
            boolean encontrado = false;
            int i = 0; 
            for (; (i < numVerts) && !encontrado;){
                encontrado = tablAdc[i].equals(v);
                if (!encontrado) i++ ;
            }
            //return (i < numVerts) ? i : —1 ;
            if(i < numVerts)
                return i;
            else
                return -1;
    }
    //Crear un nuevo vértice
    public void nuevoVertice(String nom){  
        boolean esta = numVertice(nom) >= 0;
        if(!esta){
            Vertice v = new Vertice(nom);
            v.asigVert(numVerts);
            tablAdc[numVerts++] = v;
        }
    }
    //Comprueba si dos vérticen son adyacentes
    boolean adyacente(String a, String b) throws Exception { // Comprueba si hay un arco entre dos vértices
           int v1, v2;
           v1 = numVertice(a);
           v2 = numVertice(b); 
           if (v1 < 0 || v2 < 0){
               throw new Exception ("El vértice no existe");
           } 
           if(tablAdc[v1].lad.contains(new Arco(v2))){
               return true;
           } else{
               return false;
           }
    }
    // Crea un nuevo arco
    public void nuevoArco(String a, String b) throws Exception { 
        if(!adyacente(a,b)){
            int v1 = numVertice(a);
            int v2 = numVertice(b);
            if (v1 < 0 || v2 < 0){ 
                throw new Exception ("El vértice no existe");
            }
            Arco ab = new Arco(v2);
            tablAdc[v1].lad.addFirst(ab);
        }
    } 
    //Borra un arco ya creado
    public void borrarArco(String a, String b) throws Exception{
        int v1 = numVertice(a);
        int v2 = numVertice(b);
        if(v1 < 0 || v2 < 0){
            throw new Exception ("El vértice no existe");
        }
        Arco ab = new Arco(v2);
        tablAdc[v1].lad.remove(ab);
    }
    
}
