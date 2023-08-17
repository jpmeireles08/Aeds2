import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();
        
        int[] elementos = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            elementos[i] = sc.nextInt();
        }
        
        if (N % 2 == 0) {
            System.out.println("Soma dos elementos pares consecutivos:");
            for (int i = 0; i < N; i += 2) {
                if (i + 1 < N) {
                    int soma = elementos[i] + elementos[i + 1];
                    System.out.println(elementos[i] + " + " + elementos[i + 1] + " = " + soma);
                }
            }
        } else {
            System.out.println("O número de elementos não é par.");
        }
        
        sc.close();
    }
}
