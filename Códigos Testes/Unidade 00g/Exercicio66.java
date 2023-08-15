import java.util.Scanner;

public class Exercicio66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String inputString = sc.nextLine();

        boolean ehPalindromo = true;
        int tamanho = inputString.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (Character.toLowerCase(inputString.charAt(i)) != Character.toLowerCase(inputString.charAt(tamanho - 1 - i))) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }

        sc.close();
    }
}
