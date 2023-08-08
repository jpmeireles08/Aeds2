import java.util.Scanner;

public class Exercicio03 {
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
        
        bubbleSort(vetor);
        int menor = vetor[0];
        int maior = vetor[n - 1];
        
        System.out.println("Maior elemento do vetor: " + maior);
        System.out.println("Menor elemento do vetor: " + menor);
        
        sc.close();
    }

    static void bubbleSort(int vetor[]) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}
