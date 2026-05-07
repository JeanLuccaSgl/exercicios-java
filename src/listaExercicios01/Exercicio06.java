package listaExercicios01;
import java.util.Scanner;

public class Exercicio06 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        float imc;

        System.out.print("Digite sua altura (CM): ");
        int altura = sc.nextInt();
        System.out.print("Digite seu peso (KG): ");
        float peso = sc.nextFloat();

        imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal");
        }
        else if (imc >= 25 && imc <=29.9){
            System.out.println("Excesso de peso");
        }
        else if (imc >= 30 && imc <= 34.9){
            System.out.println(("Obesidade grau 1"));
        }
        else if (imc >= 35 && imc <= 39.9){
            System.out.println(("Obesidade grau 2"));
        }
        else if (imc >= 40){
            System.out.println(("Obesidade grau 3"));
        }
    sc.close();
    }
}
