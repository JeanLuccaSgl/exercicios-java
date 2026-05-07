package listaExercicios01;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numerosPares = 0;
        int numerosImpares = 0;

        System.out.print("Digite o primeiro número do intervalo: ");
        int primeiroNumero = sc.nextInt();
        System.out.print("Digite o segundo número do intervalo: ");
        int segundoNumero = sc.nextInt();

        System.out.print("Números pares: ");
            for (int i = primeiroNumero; i <= segundoNumero; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        System.out.println();

        System.out.print("Números ímpares: ");
            for (int i = primeiroNumero; i <= segundoNumero; i++){
                if (i % 2 != 0){
                    System.out.print(i + " ");
                }
        }
sc.close();
    }
}
