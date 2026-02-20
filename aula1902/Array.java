package aula1902;

public class Array {
    private Pet[] lista = new Pet[3];
    private int contador = 0;

    public void inserir(Pet pet) {
        lista[contador] = pet;
        contador++;
    }

    public void exibir() {
        for(int i = 0; i < contador; i++) {
            System.out.println(lista[i].getNome());
            System.out.println(lista[i].getRaca());
            System.out.println(lista[i].getIdade());
            System.out.println(lista[i].getId());


        }
    }
}
