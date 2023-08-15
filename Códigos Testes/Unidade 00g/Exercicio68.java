import java.util.Scanner;

public class Exercicio68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        int posicao = -1;

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'A' || palavra.charAt(i) == 'a') {
                posicao = i + 1; 
                i = 9999;
            }
        }

        if (posicao != -1) {
            System.out.println("A primeira ocorrência da letra 'A' está na posição: " + posicao);
        } else {
            System.out.println("A letra 'A' não foi encontrada na palavra.");
        }

        sc.close();
    }
}
