import java.util.Random;
import java.util.Scanner;

public class Sequencial {
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

        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + i + ": " + vetor[i]);
        }
        
        for (int i = 0; i < n; i++) {
            if (vetor[i] == 8) {
                System.out.println("O elemento 8 esta no vetor, na posição: " + i);
                i = n;
                resp = true;
            }
        }

        if (resp == false) {
        System.out.println("O elemento não está no vetor");
        }

        sc.close();
    }
}