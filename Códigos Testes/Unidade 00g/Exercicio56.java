import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas (L): ");
        int L = sc.nextInt();

        System.out.print("Digite o número de colunas (C): ");
        int C = sc.nextInt();

        int[][] matriz = new int[L][C];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz transposta:");
        for (int j = 0; j < C; j++) {
            for (int i = 0; i < L; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
