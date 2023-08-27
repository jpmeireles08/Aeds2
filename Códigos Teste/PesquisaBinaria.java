import java.util.Random;
import java.util.Scanner;

public class PesquisaBinaria {
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

        for (int i = 0; i < (n - 1); i++) {
            int menor = i;
            int temp;
            for (int j = (i + 1); j < n; j++) {
                if (vetor[menor] > vetor[j]) {
                    temp = vetor[menor];
                    vetor[menor] = vetor[j];
                    vetor[j] = temp;
                }
            }
              
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + i + ": " + vetor[i]);
        }

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
