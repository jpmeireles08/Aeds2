import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        int numCaracteres = palavra.length();
        int numLetras = 0;
        int numVogais = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = Character.toLowerCase(palavra.charAt(i));
            if (Character.isLetter(c)) {
                numLetras++;
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    numVogais++;
                }
            }
        }

        int numNaoLetras = numCaracteres - numLetras;
        int numConsoantes = numLetras - numVogais;

        System.out.println("Número de caracteres: " + numCaracteres);
        System.out.println("Número de letras: " + numLetras);
        System.out.println("Número de não letras: " + numNaoLetras);
        System.out.println("Número de vogais: " + numVogais);
        System.out.println("Número de consoantes: " + numConsoantes);

        sc.close();
    }
}
