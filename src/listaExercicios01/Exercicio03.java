package listaExercicios01;
import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int soma, multiplicacao, divisao, subtracao;

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        sc.nextLine(); //Para não ter erro na troca de nextInt para nextLine

        System.out.print("Escolha a operação (Adição, Subtração, Multiplicação, Divisão): ");
        String operacao = sc.nextLine().toLowerCase();

        switch(operacao){
            case "adição":
            case "adicao":
            case "adiçao":
            case "adicão":
            case "soma":
            case "+":
                soma = numero1 + numero2;
                System.out.printf("%d + %d = %d", numero1, numero2, soma);
                break;

            case "subtracao":
            case "subtração":
            case "subtracão":
            case "subtraçao":
            case "-":
                subtracao = numero1 - numero2;
                System.out.printf("%d - %d = %d", numero1, numero2, subtracao);
                break;

            case "multiplicação":
            case "multiplicacao":
            case "multiplicaçao":
            case "multiplicacão":
            case "x":
                multiplicacao = numero1 * numero2;
                System.out.printf("&d x %d = %d", numero1, numero2, multiplicacao);
                break;

            case "divisão":
            case "divisao":
            case "/":
                divisao = numero1 / numero2;
                System.out.printf("%d / %d = %d", numero1, numero2, divisao);
                break;
        }
        sc.close();
    }
}
