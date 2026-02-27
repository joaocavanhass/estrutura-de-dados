package aula1902;

public class Array {
    private Pet[] lista = new Pet[3];
    private int contador = 0;

    public void inserir(Pet pet) {
        if (contador == lista.length) {
            //Criar um array maior
            lista = alocarNovoArray();
        }
        lista[contador++] = pet;
    }

    public void exibir() {
        for (int i = 0; i < contador; i++) {
            System.out.println(lista[i]);
        }
    }
    private Pet[] alocarNovoArray() {
        Pet[] novo = new Pet[lista.length + 3];
        
        System.arraycopy(lista, 0, novo, 0, lista.length);
        
        return novo;
    }

    public int pesquisar (int id) {
    for (int i = 0; i < contador; i++) {
        if (id == lista[i].getId()) {
            return i; 
        }
    }
    return -1; 
}
}
