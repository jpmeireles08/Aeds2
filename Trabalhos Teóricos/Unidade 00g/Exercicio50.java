import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();
        
        int[] numeros = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        System.out.println("Soma dos elementos correspondentes:");
        for (int i = 0; i < N / 2; i++) {
            int soma = numeros[i] + numeros[N - 1 - i];
            System.out.println(numeros[i] + " + " + numeros[N - 1 - i] + " = " + soma);
        }
        
        if (N % 2 != 0) {
            System.out.println("Elemento central: " + numeros[N / 2]);
        }
        
        sc.close();
    }
}
