package listaExercicios02;
import java.util.Scanner;
import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        int numeroAleatorio = gerador.nextInt(100) + 1;

        int numeroUsuario = 0;
        while (numeroUsuario != numeroAleatorio){
            System.out.print("Digite um número entre 1 e 100: ");
            numeroUsuario = sc.nextInt();

            if (numeroUsuario == numeroAleatorio){
                System.out.println("Parabéns! Você acertou o número");
                break;
            }
            else {
                if (numeroUsuario < numeroAleatorio){
                    System.out.println("O número aleatório é maior, tente novamente!");
                }
                else {
                    System.out.println("O número aleatório é menor, tente novamente!");
                }
            }
        }

    }
}
