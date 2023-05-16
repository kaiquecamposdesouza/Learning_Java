import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAAdivinhar = new Random().nextInt(100);
        int palpites = 0;
        int quantidadeDePalpites = 5;
        System.out.println("***Jogo da adivinhação***");
        System.out.println("O sistema vai gerar um numero aleatorio entre 1 e 100, você tem 5 tentativas " +
                "para acertar qual é o numero em questão");

        while (quantidadeDePalpites > 0){
            System.out.println("Digite seu palpite: ");
            palpites = leitura.nextInt();
            quantidadeDePalpites--;

            if (numeroAAdivinhar == palpites){
                System.out.println("Meus parabens!!!Você acertou!!!!");
                break;
            }else{
                if (quantidadeDePalpites > 0){
                    System.out.println("Tente novamente, você ainda tem: " + quantidadeDePalpites + " chances");
                    if (numeroAAdivinhar > palpites){
                        System.out.println("O seu palpite foi muito baixo, que tal aumenta-lo");
                    }else {
                        System.out.println("O seu palpite foi muito alto, que tal abaixa-lo");
                    }
                }
            }
        }
        System.out.println("O numero era " + numeroAAdivinhar);
    }
}
