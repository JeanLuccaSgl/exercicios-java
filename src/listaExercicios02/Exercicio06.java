package listaExercicios02;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroUsuario = 1;

        while(numeroUsuario != 0) {
            System.out.print("Digite um número para descobrir sua tabela (0 para sair): ");
            numeroUsuario = sc.nextInt();

            if (numeroUsuario == 0){
                System.out.println("Encerrando...");
            }
            else {
                for (int i = 1; i <= 10; i++){
                    int tabuada = i * numeroUsuario;
                    System.out.println(i + " x " + numeroUsuario + " = " + tabuada);
                }
            }
        }
        sc.close();
    }
}
