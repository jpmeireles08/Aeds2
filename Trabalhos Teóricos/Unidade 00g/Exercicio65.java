import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string contendo um número inteiro: ");
        String inputString = sc.nextLine();

        try {
            int numeroInteiro = Integer.parseInt(inputString);
            System.out.println("Número inteiro convertido: " + numeroInteiro);
        } catch (NumberFormatException e) {
            System.out.println("A string não representa um número inteiro válido.");
        }

        sc.close();
    }
}
