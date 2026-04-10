package principal;

import array.ArrayPet;
import modelo.Pet;

public class UsaArrayPet {

    public static void main(String[] args) {

        ArrayPet pets = new ArrayPet();

        pets.inserir(new Pet("Rex", 3, "Cachorro"));
        pets.inserir(new Pet("Mia", 2, "Gato"));
        pets.inserir(new Pet("Bob", 5, "Cachorro"));
        pets.inserir(new Pet("Luna", 1, "Gato"));

        Pet pet = pets.pesquisar(2);
        if (pet != null) {
            System.out.println(pet);
        } else {
            System.out.println("Pet não encontrado!");
        }
    }
}