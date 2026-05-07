package listaExercicios02;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos termos da sequência você deseja ver: ");
        int n = sc.nextInt();

        int primeiro = 0;
        int segundo = 1;

        System.out.println("Os primeiros " + n + " termos são:");

        for (int i = 1; i <= n; i++){
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        System.out.println("Fim da sequência.");
        sc.close();
    }
}
