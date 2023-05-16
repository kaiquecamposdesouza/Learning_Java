import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        //Instaciando um objeto da classe Scanner para a leitura de entrada no teclado
        Scanner leitura = new Scanner(System.in);
        //lendo a entrada de uma strng com 'nextLine()'
        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        //lendo a entrada de um inteiro com 'nextInt()'
        System.out.println("Qual o ano de lançamento do filme: ");
        int ano = leitura.nextInt();
        //lendo a entrada de um ponto flutuante com 'nextDouble()'
        System.out.println("Digite sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println(avaliacao);

    }
}
