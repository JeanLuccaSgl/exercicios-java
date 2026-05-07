package listaExercicios01;
import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero == 0){
            System.out.println("O número digitado é 0");
        }
        else if (numero > 0){
            System.out.println("O número digitado é positivo");
        }
        else{
            System.out.println("O número digitado é negativo");
        }
    }
}
