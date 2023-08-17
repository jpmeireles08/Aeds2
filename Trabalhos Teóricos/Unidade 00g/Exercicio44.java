import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        int menorElemento = array[0];
        int posicaoMenor = 0;

        for (int i = 1; i < n; i++) {
            if (array[i] < menorElemento) {
                menorElemento = array[i];
                posicaoMenor = i;
            }
        }

        System.out.println("O menor elemento está na posição: " + posicaoMenor);

        sc.close();
    }
}
