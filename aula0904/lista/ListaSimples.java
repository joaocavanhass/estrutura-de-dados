package lista;

public class ListaSimples {

    private No inicio;

    public void inserir(Object objeto) {
        No novo = new No(objeto);

        if (inicio == null) {
            inicio = novo;
        } else {
            No ref = inicio;
            while (ref.getProx() != null) {
                ref = ref.getProx();
            }
            ref.setProx(novo);
        }
    }

    public int contarNos() {
        int cont = 0;
        No ref = inicio;

        while (ref != null) {
            cont++;
            ref = ref.getProx();
        }
        return cont;
    }

    public void inserirEntre(Object objeto) {
        if (inicio == null || inicio.getProx() == null) {
            inserir(objeto);
            return;
        }

        No novo = new No(objeto);
        novo.setProx(inicio.getProx());
        inicio.setProx(novo);
    }

    public void inserirCircular(Object objeto) {
        No novo = new No(objeto);

        if (inicio == null) {
            inicio = novo;
            novo.setProx(inicio);
        } else {
            No ref = inicio;
            while (ref.getProx() != inicio) {
                ref = ref.getProx();
            }
            ref.setProx(novo);
            novo.setProx(inicio);
        }
    }

    public void exibirCircular() {
        if (inicio == null) return;

        No ref = inicio;
        do {
            System.out.println(ref.getObjeto());
            ref = ref.getProx();
        } while (ref != inicio);
    }
}
