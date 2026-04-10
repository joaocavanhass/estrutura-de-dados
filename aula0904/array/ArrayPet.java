package array;

import modelo.Pet;

public class ArrayPet {

    private final int TAMANHO = 10;
    private Pet[] lista = new Pet[TAMANHO];
    private int indice = 0;

    public boolean inserir(Pet pet) {
        if (indice < TAMANHO) {
            lista[indice++] = pet;
            return true;
        }
        return false;
    }

    public void ordenarPorNome() {
        Pet temp;
        for (int i = 0; i < indice - 1; i++) {
            for (int j = 0; j < indice - 1 - i; j++) {
                if (lista[j].getNome()
                        .compareToIgnoreCase(lista[j + 1].getNome()) > 0) {

                    temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }

    public Pet pesquisar(int id) {
        return buscaRec(id, 0, indice - 1);
    }

    private Pet buscaRec(int id, int inicio, int fim) {
        if (inicio > fim) {
            return null;
        }

        int meio = (inicio + fim) / 2;

        if (lista[meio].getId() == id) {
            return lista[meio];
        } else if (id < lista[meio].getId()) {
            return buscaRec(id, inicio, meio - 1);
        } else {
            return buscaRec(id, meio + 1, fim);
        }
    }

    public void exibir() {
        for (int i = 0; i < indice; i++) {
            System.out.println(lista[i]);
        }
    }
}