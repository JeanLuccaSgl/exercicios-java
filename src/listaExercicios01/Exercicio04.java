package listaExercicios01;
import java.util.Scanner;

public class Exercicio04 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int numerosImpares = 0;
        int numerosPares = 0;

        for(int i = 1; i <=10; i++){
            System.out.print("Digite o número: ");
            int numeroUsuario = sc.nextInt();
            if (numeroUsuario % 2 == 0){
                numerosPares++;
            }
            else{
                numerosImpares++;
            }
        }
        System.out.printf("Existem %d pares e %d ímpares", numerosPares, numerosImpares);
    }
}