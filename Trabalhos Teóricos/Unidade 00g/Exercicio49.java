import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();
        
        int[] elementos = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            elementos[i] = sc.nextInt();
        }
        
        int pares = 0;
        int divisiveisPorTres = 0;
        
        for (int elemento : elementos) {
            if (elemento % 2 == 0) {
                pares++;
            }
            if (elemento % 3 == 0) {
                divisiveisPorTres++;
            }
        }
        
        System.out.println("Número de elementos pares: " + pares);
        System.out.println("Número de elementos divisíveis por três: " + divisiveisPorTres);
        
        sc.close();
    }
}
