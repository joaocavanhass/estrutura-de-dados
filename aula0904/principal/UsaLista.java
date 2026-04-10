package principal;

import lista.ListaSimples;

public class UsaLista {

    public static void main(String[] args) {

        ListaSimples lista = new ListaSimples();

        lista.inserirCircular("A");
        lista.inserirCircular("B");
        lista.inserirCircular("C");

        System.out.println("=== Exibindo lista circular ===");
        lista.exibirCircular();

        System.out.println("\nQuantidade de nós: " + lista.contarNos());
    }
}