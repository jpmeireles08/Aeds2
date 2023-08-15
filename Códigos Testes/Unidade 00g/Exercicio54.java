import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();
        
        int[] vetor = new int[N];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
        
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("Elementos do vetor ordenados:");
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }

        sc.close();
    }
}
