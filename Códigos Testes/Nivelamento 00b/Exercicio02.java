import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor:");
        int n = sc.nextInt();
        sc.nextLine();
        int vetor[] = new int[n];
        System.out.println("Informe os numeros do vetor:");
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
            sc.nextLine();
        }

        ordenarVetor(vetor);

        System.out.println("Escolha um numero para verificar:");
        int num = sc.nextInt();
        sc.nextLine();
        comparar(vetor, num);
        sc.close();
    }

    static void ordenarVetor(int vetor[]) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            int temp = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = temp;
        }
    }

    static void comparar(int vetor[], int comparar) {
        boolean existe = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == comparar) {
                existe = true;
                break;
            }
        }

        if (existe == true) {
            System.out.println("O numero " + comparar + " existe nesse vetor");
        } else {
            System.out.println("O numero " + comparar + " nao existe nesse vetor");
        }
    }
}
