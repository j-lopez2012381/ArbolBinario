/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinariografico;

import java.util.LinkedList;

/**
 *
 * @author Estuardo
 */
public class ArbolBin {
    private Nodo raiz;
    private int numNodos;
    private int alt;
    
    public ArbolBin(){
        raiz = null;
        numNodos = 0;
        alt = 0;
    }
    
    public void insertar(int dato){
        if(existe(dato))return;
        Nodo nuevo = new Nodo(dato);
        
        if(raiz==null)
            raiz = nuevo;
        else{
            Nodo anterior = null;
            Nodo tmp = raiz;
            while(tmp != null){
                anterior = tmp;
                if(dato < tmp.getDato())
                    tmp = tmp.getIzq();
                else
                    tmp = tmp.getDer();
            }
            
            if(dato < anterior.getDato())
                anterior.setIzq(nuevo);
            else
                anterior.setDer(nuevo);
        }
        
        numNodos++;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public int getNumNodos() {
        return numNodos;
    }
    
    public void preorden(Nodo aux, LinkedList recorrido){
        if(aux != null){
            recorrido.add(aux.getDato());
            preorden (aux.getIzq(), recorrido);
            preorden (aux.getDer(), recorrido);
        }
    }
    
    public void inorden(Nodo aux, LinkedList recorrido){
        if(aux != null){
            inorden (aux.getIzq(), recorrido);
            recorrido.add(aux.getDato());
            inorden (aux.getDer(), recorrido);
        }
    }
    
    public void postorden(Nodo aux, LinkedList recorrido){
        if(aux != null){
            postorden (aux.getIzq(), recorrido);
            postorden (aux.getDer(), recorrido);
            recorrido.add(aux.getDato());
        }
    }
    
    public void porNivel(Nodo aux, LinkedList recorrido){
        LinkedList<Nodo> cola = new LinkedList<Nodo>();
        cola.addLast(aux);
        while(cola.size() > 0){
            Nodo tmp = cola.pollFirst();
            recorrido.add(tmp.getDato());
            if(tmp.getIzq() != null){
                cola.addLast(tmp.getIzq());
            }
            if(tmp.getDer() != null){
                cola.addLast(tmp.getDer());
            }
        }
    }
    
    public boolean existe(int dato){
        Nodo aux = raiz;
        while(aux != null){
            if(dato == aux.getDato())
                return true;
            else
                if(dato>aux.getDato())
                    aux=aux.getDer();
                else 
                    aux=aux.getIzq();
        }
        return false;
    }
    
    
}
