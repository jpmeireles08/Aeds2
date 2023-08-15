import java.util.Scanner;

public class Exercicio67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        int totalCaracteres = palavra.length();
        int totalMaiusculos = 0;

        for (int i = 0; i < totalCaracteres; i++) {
            if (Character.isUpperCase(palavra.charAt(i))) {
                totalMaiusculos++;
            }
        }

        System.out.println("Número total de caracteres: " + totalCaracteres);
        System.out.println("Número de caracteres maiúsculos: " + totalMaiusculos);

        sc.close();
    }
}
