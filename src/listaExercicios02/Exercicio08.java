package listaExercicios02;
import java.util.Scanner;
import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        int pontosUsuario = 0;
        int pontosComputador = 0;

        while (true) {
            int pcNumero = gerador.nextInt(3);
            String pcEscolha = "";

            if (pcNumero == 0) {
                pcEscolha = "pedra";
            } else if (pcNumero == 1) {
                pcEscolha = "papel";
            } else {
                pcEscolha = "tesoura";
            }

            System.out.print("\nSua jogada (pedra, papel, tesoura ou sair): ");
            String escolhaUsuario = sc.nextLine().toLowerCase().trim();

            if (escolhaUsuario.equals("sair")) {
                System.out.println("Encerrando o jogo");
                break;
            }

            if (!escolhaUsuario.equals("pedra") && !escolhaUsuario.equals("papel") && !escolhaUsuario.equals("tesoura")) {
                System.out.println("Digite apenas pedra, papel ou tesoura!");
                continue;
            }

            System.out.println("Computador escolheu: " + pcEscolha);

            if (escolhaUsuario.equals(pcEscolha)) {
                System.out.println("Empate!");
            } else if ((escolhaUsuario.equals("pedra") && pcEscolha.equals("tesoura")) ||
                    (escolhaUsuario.equals("papel") && pcEscolha.equals("pedra")) ||
                    (escolhaUsuario.equals("tesoura") && pcEscolha.equals("papel"))) {
                System.out.println("Você ganhou!");
                pontosUsuario++;
            } else {
                System.out.println("O computador ganhou");
                pontosComputador++;
            }

            System.out.println("Placar\n Você: " + pontosUsuario + " | PC: " + pontosComputador);
        }

        System.out.println("\nFim fo jogo");
        System.out.println("Placar final: Você " + pontosUsuario + " x " + pontosComputador + " Computador");

        sc.close();
    }
}