package evaluacion_unidad_ii;

import java.util.Scanner;

/**
 * @authors
 * José Sebastian López Ibarra
 * Sebastián Emilio Murillo Andrade
 * Andrés Saen Olivas
 * Domingo 30 de Octubre de 2022
 */

public class Evaluacion_Unidad_II {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        String contenido;
        int detener;
        int imprimir;
        
        do {
            System.out.println("Ingresa una palabra:");
            contenido = entrada.next();
        
            arbol.insertar(contenido); // Se inserta la cadena en el ábol
            
            System.out.println("¿Quieres seguir capturando? (Si = 1, No = 0)");
            detener = entrada.nextInt();
            
        } while(detener == 1); // Hasta que el usuario desee, el ciclo termina
        
        System.out.println("\n¿Cómo quieres imprimir los datos?\n");
        System.out.println("In Order = 1\n" + "Post Order = 2\n" + "Pre Order = 3\n");        
        imprimir = entrada.nextInt();
        
        switch (imprimir) {
            case 1:
                arbol.inOrder();
                break;
            case 2:
                arbol.postOrder();
                break;
            case 3:
                arbol.preOrder();
                break;
            default:
                System.out.println("Ingresa un número válido.");
        }
    }    
}