import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = sc.nextInt();
        
        System.out.print("Digite o número de colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Média dos elementos de cada coluna:");
        for (int j = 0; j < colunas; j++) {
            int somaColuna = 0;
            for (int i = 0; i < linhas; i++) {
                somaColuna += matriz[i][j];
            }
            double mediaColuna = (double) somaColuna / linhas;
            System.out.println("Coluna " + (j + 1) + ": " + mediaColuna);
        }

        sc.close();
    }
}
