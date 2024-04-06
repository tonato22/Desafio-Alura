import java.util.Scanner;

public class Alura {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome = "Gustavo Tonato Maia";

        String tipoDeConta = "corrente";

        double saldo = 2500;


        int opcao = 0;




        System.out.println("******************************************************");
        System.out.println("nome do cliente: " + nome);
        System.out.println("tipo de conta: " + tipoDeConta);
        System.out.println("Saldo disponivel: " + saldo);
        System.out.println("******************************************************");


        while (opcao !=4){

            System.out.println();
            System.out.println("******************************************************");
            System.out.println("** 1 - para consultar saldo ** ");
            System.out.println("2 - para transferir um valor: ");
            System.out.println("3 - para receber um valor: ");
            System.out.println("** 4 - para sair **");
            System.out.println("******************************************************");
            opcao = ler.nextInt();

            if (opcao == 1){
                System.out.println("O saldo disponivel é de: " + saldo);
            } else if (opcao == 2) {
                System.out.println("digite o valor que deseja transferir: ");
                double valorDesejado = ler.nextDouble();

                if (valorDesejado > saldo){
                    System.out.println("Saldo menor do que a transferencia");
                }else{
                    saldo -= valorDesejado;
                    System.out.println("O novo saldo é de: " + saldo);
                }

            } else if (opcao == 3) {
                System.out.println("digite o valor que deseja receber: ");
                double valorRecebido = ler.nextDouble();
                saldo += valorRecebido;
                System.out.println("O novo saldo é de: " + saldo);

            } else if (opcao != 4) {
                System.out.println("opção invalida");
            }


        }
    }

}