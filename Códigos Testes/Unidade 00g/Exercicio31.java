import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        int vetor[] = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o elemento numero " + (i+1) + ":");
            vetor[i] = sc.nextInt();
        }

        int maior = vetor[0];
        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            
            }
        }

        int menor = vetor[0];
        for (int i = 1; i < 10; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("O maior elemento: " + maior);
        System.out.println("O menor elemento: " + menor);

        sc.close();
    }
}