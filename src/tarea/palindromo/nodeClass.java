/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.palindromo;

/**
 *
 * @author Daniel Salinas
 * @param <T>
 */
public class nodeClass <T> {
    //atributos
    private T data;
    private nodeClass next;
    //constructor
    public nodeClass (T data){
        this.data = data;
        this.next = null;
    }
    public void setData (T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }
    public void setNext(nodeClass n){
        this.next=n;
    }
    public nodeClass getNext(){
        return this.next;
    }
}

