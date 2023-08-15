import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String inputString = sc.nextLine();

        boolean apenasDigitos = true;

        for (int i = 0; i < inputString.length(); i++) {
            if (!Character.isDigit(inputString.charAt(i))) {
                apenasDigitos = false;
                break;
            }
        }

        if (apenasDigitos) {
            System.out.println("A string é composta apenas por dígitos.");
        } else {
            System.out.println("A string não é composta apenas por dígitos.");
        }

        sc.close();
    }
}
