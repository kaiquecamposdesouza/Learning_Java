public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidadoNoPlano = true;
        double  notaDoFilme = 8.1;
        //Essa media foi calculado a partir das notas atribuidas por Jack, Paulo e Pitter
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse = """
                (Isso é uma ferramento que surgio a apartir do Java 15 chamado TEXTBOX)
                Continuação do filme Top Gun dos anos 80
                Filme de aventura com galã Tom Cruise
                Muito bom!
                Ano de lançamento: 
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) media / 2;
        System.out.println(classificacao);
    }
}