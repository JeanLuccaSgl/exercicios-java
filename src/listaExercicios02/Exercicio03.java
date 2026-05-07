package listaExercicios02;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o início do intervalo: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o fim do intervalo: ");
        int fim = sc.nextInt();

        System.out.println("Números primos entre " + inicio + " e " + fim + ":");

        for (int i = inicio; i <= fim; i++) {
            if (i < 2) continue;

            boolean ehPrimo = true;

            for (int divisor = 2; divisor < i; divisor++) {
                if (i % divisor == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}