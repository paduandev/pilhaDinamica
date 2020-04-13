package br.paduan;

import javax.xml.transform.SourceLocator;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");

        System.out.println(pilha.show());

        System.out.println("Valor no Topo: " + pilha.peek());
        

        while(!pilha.isEmpty()){
            System.out.println(pilha.pop().getName());
        }

    }
}
