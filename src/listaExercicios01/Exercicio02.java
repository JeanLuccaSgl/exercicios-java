package listaExercicios01;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        System.out.print("Digite um número inteiro positivo (Insira um número negativo para finalizar): ");
        int numeroUsuario = sc.nextInt();

        while(numeroUsuario >= 1){
            soma = soma + numeroUsuario;

            System.out.print("Digite o próximo número (Insira um número negativo para somar o total): ");
            numeroUsuario = sc.nextInt();
        }
        System.out.println("A soma total é: " + soma);
        System.out.println("Programa encerrado.");

        sc.close();
    }
}

