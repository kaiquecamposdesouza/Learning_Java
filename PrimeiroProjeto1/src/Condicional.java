public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidadoNoPlano = true;
        double  notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else{
            System.out.println("Filme retro que vale a pena assistir!");
        }

        if(incluidadoNoPlano && tipoPlano.equals("plus")){
            System.out.println("filme liberado!");
        }else{
            System.out.println("Deve pagar a locação!");
        }

        /*if(incluidadoNoPlano || tipoPlano.equals("plus")){
            System.out.println("filme liberado!");
        }else{
            System.out.println("Deve pagar a locação!");
        }*/
    }
}
