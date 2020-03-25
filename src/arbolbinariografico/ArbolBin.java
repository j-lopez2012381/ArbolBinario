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
    }
    
}
