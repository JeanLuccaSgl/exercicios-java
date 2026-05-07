package listaExercicios02;
import java.util.Scanner;
import java.util.Random;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        while (true){
            int pcNumero = gerador.nextInt(11);
            System.out.print("Par ou ímpar (ou sair): ");
            String escolhaParImpar = sc.nextLine().toLowerCase().trim();

            if (escolhaParImpar.equals("sair")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            if (!escolhaParImpar.equals("par") && !escolhaParImpar.equals("impar")){
                System.out.println("Digite apenas par ou ímpar!");
                continue;
            }
            else {
                System.out.print("Escolha um número de 0 a 10: ");
                int numeroUsuario = sc.nextInt();
                sc.nextLine();

                if (numeroUsuario < 0 || numeroUsuario > 10) {
                    System.out.println("Erro: O número deve ser entre 0 e 10");
                    continue;
                }

                System.out.printf("Número do computador: %d\n", pcNumero);
                System.out.printf("Soma final: %d\n", (pcNumero + numeroUsuario));

                if ((pcNumero + numeroUsuario) % 2 == 0){
                    if(escolhaParImpar.equals("par")){
                        System.out.println("Parabéns! Você ganhou");
                    } else if (escolhaParImpar.equals("impar")){
                        System.out.println("O computador ganhou");
                    }
                } else {
                    if(escolhaParImpar.equals("impar")){
                        System.out.println("Parabéns! Você ganhou");
                    } else {
                        System.out.println("O computador ganhou");
                    }
                }
            }
        }
        sc.close();
    }
}