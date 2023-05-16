import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double notas = 0;
        int quantidadeNotas = 0;

        while (notas != -1){
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar  ");
            notas = leitura.nextDouble();

            if (notas != -1){
                mediaAvaliacao += notas;
                quantidadeNotas++;
            }
        }
        System.out.println("A avaliação do filme é " + (mediaAvaliacao/quantidadeNotas));
    }
}
