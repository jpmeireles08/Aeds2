import java.util.Random;
import java.util.Scanner;

public class PesquisaBinaria {

    public static void swap(int[] vetor, int a, int b) {
        int temp = vetor[a];
        vetor[a] = vetor[b];
        vetor[b] = temp;
    }
    

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        boolean resp = false;

        System.out.println("Entre com o tamanho do vetor: ");
        int n = sc.nextInt();
        int vetor[] = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = random.nextInt(100);
        }

        int mov = 0;
        for (int i = 0; i < (n - 1); i++) {
            int menor = i;
            for (int j = (i + 1); j < n; j++) {
                if (vetor[menor] > vetor[j]) {
                    menor = j;
                }
            }
            swap(vetor, menor, i);
            mov += 3;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + i + ": " + vetor[i]);
        }

        System.out.println("Movimentações: " + mov);

        int dir = n - 1, esq = 0, meio, diferenca;
        while (esq <= dir) {
            meio = (esq + dir) / 2;
            diferenca = (8 - vetor[meio]);
            if (diferenca == 0) {
                resp = true;
                esq = n;
                System.out.println("Numero 8 esta na posição: " + meio);
            } else if (diferenca > 0) {
                esq = meio + 1;
            } else {
                dir = meio - 1;
            }
        }
        if (resp == false) {
            System.out.println("O elemento 8 nao esta no vetor");
        }
        sc.close();
    }
}
