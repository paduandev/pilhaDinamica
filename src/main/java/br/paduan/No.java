package br.paduan;

public class No {
    private String name;
    private No next;

    public No(String name){
        this.name = name;
        next = null;
    }

    public String getName(){
        return name;
    }

    public No getNext(){
        return next;
    }

    public void setNext(No next){
        this.next = next;
    }
}
