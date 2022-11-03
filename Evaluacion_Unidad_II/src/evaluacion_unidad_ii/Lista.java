package evaluacion_unidad_ii;

/**
 *
 * @author emiliomurillo
 */
public class Lista {
    private NodoLista inicio;
    private NodoLista fin;
    private int cont;

    //Por default, la lista está vacía
    public Lista() {
        this.inicio = null; //No hay nodos en la lista.
        this.fin = null;
        this.cont = 0;
    }
    
    public boolean listaVacia(){
        if(inicio == null)
           return true;
        else
            return false;
    }
    
    public void imprimir(){
        if(listaVacia())
            System.out.println("La lista está vacía.");
        else{
            NodoLista temp = inicio;
            while(temp != null){ //Moverse mientras el siguiente sea distinto de null
                System.out.print(temp.getValor() + " - ");
                    temp = temp.getSiguiente();
            }
        }
    }
    //Agregar un nodo al final de la lista
    public void agregar(String valor){
        NodoLista nuevoNodo = new NodoLista(valor);
        
        //Verificar si hay nodos en la lista
        if(inicio == null){ //No hay nodos en la lista.
            inicio = nuevoNodo; 
            fin = nuevoNodo;
        }else{ //Hay nodos en la lista.
            //Hay que moverse por la lista
            //Usando un nodo tewmporal hasta el último nodo de la lista.
            /*Nodo temp = inicio;
            while(temp.getSiguiente() != null){ //Moverse mientras el siguiente sea distinto de null
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo); //Conectamos al nuevo nodo 
            */
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
        cont++;
    }
    public int tamaLista(){
       /* int cont = 0;
        Nodo temp = inicio;
        while(temp != null){ //Moverse mientras el siguiente sea distinto de null
                temp = temp.getSiguiente();
                cont++;
        }¨*/
        return this.cont;
    }
    
    public void vaciarLista(){
        inicio = null;
        fin = null;
        cont = 0;
    }
    
    public void borrarEn(int pos) throws Exception{
            int cantNodos = tamaLista();
        //Borrar en una posición no válida
        //Posiciones negativas
        //Posiciones mayores a la cantidad de elementos
        if(pos < 0) //Posiciones negativas
            throw new Exception("No puede borrarse un nodo en una posición negativa");
        else if(pos >= cantNodos)//Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posición valida en la lista");
        else{
            //Borrar primer nodo (Listo)
            //Borrar el intermedio
            //Borrar el final
            if(pos == 0){ //Insertar al inicio de la lista
                inicio = inicio.getSiguiente();
            }else{
                NodoLista temp = inicio;
                int cont = 0;
                while(cont <= (pos-1)){
                     temp = temp.getSiguiente();
                     cont++;
                }
                NodoLista objSig = temp.getSiguiente();
                temp.setSiguiente(objSig.getSiguiente());
                //Hacer reconexión
                if (pos == (cantNodos - 1)) {//Reconectar fin
                        fin = temp;
               }
            }
        }
        this.cont--;
    }
}