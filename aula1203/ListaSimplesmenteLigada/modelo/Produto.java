package aula1203.ListaSimplesmenteLigada.modelo;

public class Produto {
    private String nome;
    private double preco;
    private int id;// auto incremento a partir do valor 1
    private static int valor = 1;

    
    //Dois construtores 
    public Produto(String nome, double preco, int id) {
        id = valor++;
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }
    //getters and setters


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    
    //toString
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", id=" + id + "]";
    }
}
