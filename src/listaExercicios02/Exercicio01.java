package listaExercicios02;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida");
        } else if (idade >= 65) {
            System.out.println("Idoso");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        } else if (idade >= 13) {
            System.out.println(("Adolescente"));
        } else {
            System.out.println("Criança");
        }
        sc.close();
    }
}
