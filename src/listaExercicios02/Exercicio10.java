package listaExercicios02;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em Reais (BRL): ");
        double valorBRL = sc.nextDouble();

        System.out.println("\nEscolha a moeda para conversão:");
        System.out.println("1 - Dólar (USD)");
        System.out.println("2 - Euro (EUR)");
        System.out.println("3 - Libra (GBP)");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        double valorConvertido;

        switch (opcao) {
            case 1:
                valorConvertido = valorBRL * 0.20;
                System.out.printf("Valor convertido: $ %.2f USD\n", valorConvertido);
                break;
            case 2:
                valorConvertido = valorBRL * 0.18;
                System.out.printf("Valor convertido: € %.2f EUR\n", valorConvertido);
                break;
            case 3:
                valorConvertido = valorBRL * 0.16;
                System.out.printf("Valor convertido: £ %.2f GBP\n", valorConvertido);
                break;
            default:
                System.out.println("Erro: Opção inválida");
                break;
        }
        sc.close();
    }
}