package listaExercicios02;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o 1º número: ");
                double n1 = sc.nextDouble();
                System.out.print("Digite o 2º número: ");
                double n2 = sc.nextDouble();

                switch (opcao) {
                    case 1: System.out.println("Resultado: " + (n1 + n2));
                    case 2: System.out.println("Resultado: " + (n1 - n2));
                    case 3: System.out.println("Resultado: " + (n1 * n2));
                    case 4: {
                        if (n2 != 0) {
                            System.out.println("Resultado: " + (n1 / n2));
                        } else {
                            System.out.println("Erro: Divisão por zero!");
                        }
                    }
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("Calculadora encerrada");
        sc.close();
    }
}