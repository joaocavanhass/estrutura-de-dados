package aula1902;

public class Pet {
    private String raca, nome;
     private int idade, id;

    public Pet() {}

    public Pet(String raca, String nome, int idade, int id) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }
    
// métodos acessores

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}