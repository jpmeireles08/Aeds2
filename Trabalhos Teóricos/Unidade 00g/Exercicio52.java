import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();

        int[] vetor1 = new int[N];
        int[] vetor2 = new int[N];

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = sc.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = sc.nextInt();
        }

        System.out.println("Elementos intercalados dos vetores:");
        for (int i = 0; i < N; i++) {
            System.out.print(vetor1[i] + " ");
            System.out.print(vetor2[i] + " ");
        }

        sc.close();
    }
}
