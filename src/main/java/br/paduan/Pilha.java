package br.paduan;

public class Pilha {
    private No top;

    public Pilha(){
        top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(String name){
        No newNode = new No(name);
        if(isEmpty()){
            top = newNode;
        }else{
            newNode.setNext(top);
            top = newNode;
        }
    }

    public No pop(){
        if(isEmpty()){
            return null;
        }
        No aux = top;

        top = top.getNext();

        return aux;
    }

    public String peek(){
        if(isEmpty()){
            return "";  
        } 
        return top.getName();
    }

    public String show(){
        String out = "";

        No aux = top;

        while(aux != null){
            out += aux.getName() + ";" ;
            aux = aux.getNext();
        }

        return out;
    }

}
