package grafo;

/**
 * @authors
 * José Sebastian López Ibarra
 * Sebastián Emilio Murillo Andrade
 * Andrés Saen Olivas
 * Domingo 30 de Octubre de 2022
 */
public class GrafoMatriz {
    int numVerts; 
    Vertice [] verts; 
    int [][] matAd;

    public GrafoMatriz(int mx){
        matAd = new int[mx][mx];
        verts = new Vertice[mx]; 
        for (int i = 0; i < mx; i++){ 
            for (int j = 0; j < mx; j++){ 
                matAd[i][j] = 0;
            }
        }
        numVerts = 0; 
    }

    public int numVertice(String vs){ //Devuelve -1 si no lo encuentra
            Vertice v = new Vertice(vs); 
            boolean encontrado = false;
            int i = 0; 
            for (; (i < numVerts) && !encontrado;){
                encontrado = verts[i].equals(v);
                if (!encontrado) i++ ;
            }
            //return (i < numVerts) ? i : —1 ;
            if(i < numVerts)
                return i;
            else
                return -1;
    }
    
    public void nuevoVertice(String nom){  //Crear nuevo vértice
        boolean esta = numVertice(nom) >= 0;
        if(!esta){
            Vertice v = new Vertice(nom);
            v.asigVert(numVerts);
            verts[numVerts++] = v;
        }
    }

    public void nuevoArco(String a, String b)throws Exception { // Busca en el array ambos vértices y marca la matriz 
        int va, vb; 
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception ("Vértice no existe"); 
        matAd[va] [vb] = 1; 
    } 
    public void nuevoArco(int va, int vb)throws Exception{
        if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
        matAd[va][vb]=1;
    }
    
    public boolean adyacente(String a, String b)throws Exception { // Comprueba si hay un arco entre dos vértices
        int va, vb;
       va = numVertice(a);
       vb = numVertice(b); 
       if (va < 0 || vb < 0) throw new Exception ("Vértice no existe"); 
       return matAd[va][vb] == 1;
    }
    public boolean adyacente(int va, int vb)throws Exception{
        if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
        return matAd[va][vb] == 1;
    }
}