package listaExercicios02;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senhaCorreta = "senha123";

        for (int i = 1; i < 4; i++){
            System.out.print("Digite a senha (Tentativa " + i + "/3): ");
            String senhaUsuario = sc.nextLine();

            if (senhaUsuario.equals(senhaCorreta)){
                System.out.print("Acesso permitido!");
                break;
            }
            else {
                if (i < 3){
                    System.out.printf("Tente novamente! %d/3 \n", i);
                }
                else{
                    System.out.println("Acesso Negado. Limite de tentativas excedido.");
                    break;
                }
            }
        }
        sc.close();
    }
}
