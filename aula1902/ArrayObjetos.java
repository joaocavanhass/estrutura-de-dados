


public class ArrayObjetos {
    
    public static void main(String[] args) {
        //instaciar a classe array
        Array array = new Array();

        //instanciar a classe pet
        Pet pet1 = new Pet("SRD", "Mel", 12, 1);
        Pet pet2 = new Pet("Pitbull", "Thor", 6, 2);
        Pet pet3 = new Pet("Maltês", "Floc", 5, 3);
        Pet pet4 = new Pet("Maltês", "Floc", 5, 4);
        Pet pet5 = new Pet("Maltês", "Floc", 5, 5);
        Pet pet6 = new Pet("Maltês", "Floc", 5, 6);
        Pet pet7 = new Pet("Maltês", "Floc", 5, 7);
        Pet pet8 = new Pet("Maltês", "Floc", 5, 8);
        Pet pet9 = new Pet("Maltês", "Floc", 5, 9);
        Pet pet10 = new Pet("Maltês", "Floc", 5, 10);


        




        array.inserir(pet1);
        array.inserir(pet2);
        array.inserir(pet3);
        array.inserir(pet4);
        array.inserir(pet5);
        array.inserir(pet6);
        array.inserir(pet7);
        array.inserir(pet8);
        array.inserir(pet9);
        array.inserir(pet10);

        //exibir o array
        array.exibir();


       System.out.println("Indice "+ array.pesquisar(5));
    }
}

