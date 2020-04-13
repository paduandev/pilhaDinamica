package br.paduan;

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
        Lista lista = new Lista();

        lista.addEnd("Huguinho");
        lista.addEnd("Zezinho");
        lista.addEnd("Luizinho");

        System.out.println(lista.show());

        No temp = lista.removeStart();
        System.out.println("Removeu " + temp.getName());

        System.out.println(lista.show());

        lista.addStart("Patinhas");

        System.out.println(lista.show());

        temp = lista.removeEnd();
        System.out.println("Removeu " + temp.getName());

        System.out.println(lista.show());

    }
}
