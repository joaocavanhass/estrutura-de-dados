package aula1902;


public class ArrayObjetos {
    
    public static void main(String[] args) {
        //instaciar a classe array
        Array array = new Array();

        //instanciar a classe pet
        Pet pet1 = new Pet("SRD", "Mel", 12, 1);
        Pet pet2 = new Pet("Pitbull", "Thor", 6, 2);
        Pet pet3 = new Pet("Maltês", "Floc", 5, 3);

        array.inserir(pet1);
        array.inserir(pet2);
        array.inserir(pet3);

        //exibir o array
        array.exibir();
    }
}