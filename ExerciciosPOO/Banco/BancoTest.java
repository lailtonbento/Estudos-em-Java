package ExerciciosPOO.Banco;


import java.util.Scanner;

public class BancoTest {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        BancoClass banco;
        System.out.println("Número da conta: ");
        int numeroConta = leia.nextInt();
        System.out.println("Nome do titular: ");
        String titular = leia.next();
        System.out.println("Deseja fazer o deposito inicial ? (S/N)");
        char opcao = leia.next().charAt(0);
        if (opcao == 'S' || opcao == 's') {
            System.out.println("Digite o valor do deposito inicial: ");
            double depositoInicial = leia.nextDouble();
            banco = new BancoClass(numeroConta, titular, depositoInicial);
        } else {
            banco = new BancoClass(numeroConta, titular);
        }
        System.out.println("Dados: ");
        System.out.println(banco.conta());
        System.out.println("Faça seu deposito: ");
        double valorDeposito = leia.nextDouble();
        banco.deposito(valorDeposito);
        System.out.println(banco.conta());
        System.out.println("Deseja fazer um saque ? (S/N)");
        char opcao1 = leia.next().charAt(0);
        if (opcao1 == 'S' || opcao == 's'){
            System.out.println("Valor: ");
            double valorSaque = leia.nextDouble();
            banco.saque(valorSaque);
            System.out.println("Obrigado por utilizar nossos serviços!");
            System.out.println(banco.conta());
        } else {
            System.out.println("Tenha um otimo dia !");
        }

        leia.close();
    }
}
