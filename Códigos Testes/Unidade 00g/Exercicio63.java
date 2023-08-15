import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String inputString = sc.nextLine();

        System.out.print("Digite um caractere: ");
        char caractere = sc.next().charAt(0);

        int contador = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == caractere) {
                contador++;
            }
        }

        System.out.println("O caractere '" + caractere + "' aparece " + contador + " vezes na string.");

        sc.close();
    }
}
