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
    

    }
