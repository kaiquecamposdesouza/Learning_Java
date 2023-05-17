public class Principal {
    public static void main(String[] args) {
        Filme filmes = new Filme();

        filmes.nome = "O Poderoso Chefão";
        filmes.anoDeLancamento = 1970;
        filmes.duracaoEmMinutos = 190;

        filmes.exibeFichaTecnica();

        filmes.avalia(8);
        filmes.avalia(5);
        filmes.avalia(10);
        System.out.println(filmes.somaDasAvaliacoes);
        System.out.println(filmes.totalDeAvaliacoes);
        System.out.println(filmes.pegaMedia());
    }
}
