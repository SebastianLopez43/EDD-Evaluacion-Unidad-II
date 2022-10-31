package grafolista;

/**
 * @authors
 * José Sebastian López Ibarra
 * Sebastián Emilio Murillo Andrade
 * Andrés Saen Olivas
 * Domingo 30 de Octubre de 2022
 */

public class GrafoLista {
    
    public static void main(String[] args){
    
        Grafo grafoLista = new Grafo(5);
        grafoLista.nuevoVertice("1");
        grafoLista.nuevoVertice("2");
        grafoLista.nuevoVertice("3");
        grafoLista.nuevoVertice("4");
        grafoLista.nuevoVertice("5");

        try{
        grafoLista.nuevoArco("1", "3");
        grafoLista.nuevoArco("1", "4");
        grafoLista.nuevoArco("5", "1");
        grafoLista.nuevoArco("5", "2");
        grafoLista.nuevoArco("5", "4");

        
        for(int i = 0; i < grafoLista.tablAdc.length; i++){
            System.out.println("Posición del vector: " + i);
            for(int j = 0; j < grafoLista.tablAdc[i].lad.size(); j++){
                System.out.println(grafoLista.tablAdc[i].lad.get(j));
            }
        }
        
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}