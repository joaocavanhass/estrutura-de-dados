package modelo;

public class Pet {

    private static int valor = 1;

    private int id;
    private String nome;
    private int idade;
    private String especie;

    public Pet(String nome, int idade, String especie) {
        this.id = valor++;
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String toString() {
        return
                "id= " + id +
                ", nome= '" + nome + '\'' +
                ", idade= " + idade +
                ", especie= '" + especie + '\'' 
                ;
    }
}  