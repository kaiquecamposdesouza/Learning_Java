import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Instanciando um obejeto da classe Scanner
        Scanner leitura = new Scanner(System.in);

        //Declaração de variaveis
        String nomeDoCliente = "Kaique Campos";
        int conta = 0;
        String tipoDeConta = "Corrente";
        String senha;
        double saldo = 200;
        double valorExterno = 0;
        int valorMenu = 0;
        String mensagem = """
                ***********************
                Dados iniciais do cliente:
                                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ***********************
                                
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """.formatted(nomeDoCliente,tipoDeConta,saldo);
        //Leitura dos valor de conta e senha digitados pelos usuarios
        System.out.println("Digite sua senha: ");
        senha = leitura.nextLine();

        System.out.println("Digite o numero da sua conta: ");
        conta = leitura.nextInt();


       /* System.out.println("Digite sua senha: ");
        senha = leitura.nextLine();*/

        //verifica se a conta e a senha conhecidem
        if (conta == 342516 && senha.equals("$enhaDoB@nco")){
            while (valorMenu != 4){
                System.out.println(mensagem);
                valorMenu = leitura.nextInt();

                switch (valorMenu){
                    case 1:
                        System.out.println(String.format("Seu saldo atual em conta é de R$ %.2f",saldo));
                        Thread.sleep(5000);
                        break;
                    case 2:
                        System.out.println("Digite o valor a receber: ");
                        valorExterno = leitura.nextDouble();
                        if (valorExterno > 0 ){
                            saldo+=valorExterno;
                            System.out.println(String.format("Seu saldo atual em conta é de R$ %.2f",saldo));
                            Thread.sleep(5000);
                        }else{
                            System.out.println("Digite o valor corretamente!");
                            Thread.sleep(2000);
                        }
                        break;
                    case 3:
                        System.out.println("Digite o valor a transferir: ");
                        valorExterno = leitura.nextDouble();
                        if (valorExterno < saldo ){
                            saldo-=valorExterno;
                            System.out.println(String.format("Seu saldo atual em conta é de R$ %.2f",saldo));
                            Thread.sleep(5000);
                        }else{
                            System.out.println("Você não possui esse valor em sua conta!");
                            Thread.sleep(2000);
                        }
                        break;
                    default:
                        if (valorMenu != 4){
                            System.out.println("Opção Invalida!");
                            Thread.sleep(2000);
                        }
                        break;
                }
            }
        }else{
            System.out.println("Conta ou Senha foram digitados incorretamente!");
        }

    }
}