public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Produto("Boné HellStar Preto", 739.99, 1));
        lista.inserir(new Produto("AirForce 1 White", 699.99, 2));
        lista.inserir(new Produto("Óculos Chrome Hearts", 419.99, 3));
        lista.exibir();
    }
}