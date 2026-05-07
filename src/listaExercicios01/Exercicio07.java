package listaExercicios01;
import java.util.Scanner;

public class Exercicio07 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        float nota = sc.nextFloat();

        if (nota > 100 || nota < 0){
            System.out.println("Nota inválida");
        }
        else if (nota >= 90){
            System.out.println("Conceito final: A");
        }
        else if (nota >= 80){
            System.out.println("Conceito final: B");
        }
        else if (nota >= 70) {
            System.out.println("Conceito final: C");
        }
        else if (nota >= 60 ){
            System.out.println("Conceito final: D");
        }
        else{
            System.out.println("Conceito final: F");
        }
    sc.close();
    }
}
