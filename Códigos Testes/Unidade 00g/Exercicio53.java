import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();
        
        System.out.print("Digite o valor de M: ");
        int M = sc.nextInt();
        
        int[] vetorN = new int[N];
        int[] vetorM = new int[M];

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorN[i] = sc.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < M; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorM[i] = sc.nextInt();
        }

        int tamanhoMinimo = Math.min(N, M);

        System.out.println("Elementos intercalados dos vetores:");
        for (int i = 0; i < tamanhoMinimo; i++) {
            System.out.print(vetorN[i] + " ");
            System.out.print(vetorM[i] + " ");
        }

        if (N > M) {
            for (int i = M; i < N; i++) {
                System.out.print(vetorN[i] + " ");
            }
        } else if (M > N) {
            for (int i = N; i < M; i++) {
                System.out.print(vetorM[i] + " ");
            }
        }

        sc.close();
    }
}
