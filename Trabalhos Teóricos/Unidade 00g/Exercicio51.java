import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();
        
        int[] numeros = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        int somaMultiplosDeTres = 0;
        for (int numero : numeros) {
            if (numero % 3 == 0) {
                somaMultiplosDeTres += numero;
            }
        }
        
        System.out.println("Soma dos números múltiplos de três: " + somaMultiplosDeTres);
        
        sc.close();
    }
}
