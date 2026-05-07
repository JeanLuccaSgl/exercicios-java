package listaExercicios01;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float maiorNumero;

        System.out.print("Digite o primeiro número: ");
        float num1 = sc.nextFloat();
        System.out.print("Digite o segundo número: ");
        float num2 = sc.nextFloat();
        System.out.print("Digite o terceiro número: ");
        float num3 = sc.nextFloat();

        if (num1 > num2 && num1 > num3){
            maiorNumero = num1;
            System.out.printf("%f é o maior número", maiorNumero);
        }
        else if (num2 > num1 && num2 > num3){
            maiorNumero = num2;
            System.out.printf("%f é o maior número", maiorNumero);
        }
        if (num3 > num2 && num3 > num1){
            maiorNumero = num3;
            System.out.printf("%f é o maior número", maiorNumero);
        }
    }
}
