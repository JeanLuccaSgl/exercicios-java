package listaExercicios01;
import java.util.Scanner;

public class Exercicio08 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a forma geométrica para calcular sua área:");
        System.out.println("1. Triângulo");
        System.out.println("2. Circulo");
        System.out.println("3. Retângulo");
        System.out.println("Opção: ");
        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                float areaTriangulo;
                System.out.print("Digite o valor da base: ");
                float baseTriangulo = sc.nextFloat();
                System.out.print("Digite o valor da altura: ");
                float alturalTriangulo = sc.nextFloat();

                areaTriangulo = (baseTriangulo * alturalTriangulo) / 2;

                System.out.printf("Área do triângulo: %f", areaTriangulo);

            case 2:
                float areaCirculo;

                System.out.print("Digite o valor do raio do circulo: ");
                float raioCirculo = sc.nextFloat();

                areaCirculo = 3.14f * (raioCirculo * raioCirculo);

                System.out.printf("Área do circulo: %f", areaCirculo);

            case 3:
                float areaRetangulo;

                System.out.print("Digite o valor da base do retângulo: ");
                float baseRetangulo = sc.nextFloat();
                System.out.print("Digite o valor da altura do retângulo: ");
                float alturaRetandgulo = sc.nextFloat();

                areaRetangulo = baseRetangulo * alturaRetandgulo;

                System.out.printf("Área do retângulo: %f", areaRetangulo);

        }
        sc.close();
    }
}
