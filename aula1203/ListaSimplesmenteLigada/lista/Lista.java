public class Lista {
    private No inicio, aux, atual;//referencias

    /**
     * Insere um nó na lista SimplesmenteLigada.
     * @param produto Produto
     */
    
    public void inserir (Produto produto) {
         if (inicio == null) {// lista vazia
            inicio = new No(produto, null);
            aux = inicio;
        } else {
            atual = new No(produto, null);
            aux.setProx(atual);
            aux = atual;
        }
    }

    /**
     * 
     */
    public void exibir() {
        No e = inicio;
        while (e != null) {
            System.out.println(e.getProduto());
            e = e.getProx();
        }
    }
    public boolean remover(int id) {
        No remov = inicio, anterior = inicio;
        while (remov != null) {
            if (id == remov.getProduto().getId()) {
                break;
            }
            anterior = remov;
            remov = remov.getProx();
        }
        if (remov != null) {
            if (remov == inicio) {
                inicio = remov.getProx();
                remov.setProx(null);
            } else if (remov == atual) {
                aux = anterior;
                atual = anterior;
                anterior.setProx(null);
            } else {
                anterior.setProx(remov.getProx());
                remov.setProx(null);
            }


            return true;
        }
        return false;
    }
}