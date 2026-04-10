package lista;

public class No {

    private Object objeto;
    private No prox;

    public No(Object objeto) {
        this.objeto = objeto;
        this.prox = null;
    }

    public Object getObjeto() {
        return objeto;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}