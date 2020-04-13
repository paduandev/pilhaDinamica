package br.paduan;

public class Lista {
    private No first;

    public Lista(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void addEnd(String name){
        No newNode = new No(name);
        if(isEmpty()){
            first = newNode;
        }else{
            No aux = first;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
    }

    public void addStart(String name){
        if(isEmpty()){
            addEnd(name);
        }else{
            No newNode = new No(name);
            newNode.setNext(first);
            first = newNode;
        }
    }

    public No removeStart(){
        if(isEmpty()){
            return null;
        }
        No aux = first;

        first = first.getNext();

        return aux;
    }

    public No removeEnd(){
        if(isEmpty()){
            return null;
        }
        No aux = first;
        No previous = null;

        while(aux.getNext() != null){
            previous = aux;
            aux = aux.getNext();
        }
        
        if(previous == null){
            first = null;
        }else{
            previous.setNext(null);
        }
        return aux;
    }

    public String show(){
        String out = "";

        No aux = first;

        while(aux != null){
            out += aux.getName() + ";" ;
            aux = aux.getNext();
        }

        return out;
    }

}
