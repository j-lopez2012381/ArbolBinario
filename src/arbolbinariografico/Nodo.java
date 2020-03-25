/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinariografico;

/**
 *
 * @author Estuardo
 */
public class Nodo {
    private int dato;
    private Nodo izq,der;
    
    public Nodo(int dato){
        this.dato = dato;
        izq = null;
        der = null;    
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
    
    
    
    
}
