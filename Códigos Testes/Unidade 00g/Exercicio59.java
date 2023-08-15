import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();

        int[][] matriz = new int[N][N];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal:");
        for (int i = 0; i < N; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("\nDiagonal secundária:");
        for (int i = 0; i < N; i++) {
            System.out.print(matriz[i][N - 1 - i] + " ");
        }

        sc.close();
    }
}
