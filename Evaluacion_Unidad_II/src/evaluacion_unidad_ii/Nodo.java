package evaluacion_unidad_ii;

/**
 * @authors
 * José Sebastian López Ibarra
 * Sebastián Emilio Murillo Andrade
 * Andrés Saen Olivas
 * Domingo 30 de Octubre de 2022
 */

public class Nodo { 
    private Nodo derecha; 
    private Nodo izquierda;
    private String contenido;
     
    public Nodo() {
        this.derecha = null;
        this.izquierda = null;
    }

    public Nodo(String contenido) {
        this.contenido = contenido;
        this.derecha = null; 
        this.izquierda = null;
    }    

    public Nodo getDerecha() {
        return derecha;
    }
    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }
    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }    
}