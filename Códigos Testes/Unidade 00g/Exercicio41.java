import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de números: ");
        int n = sc.nextInt();
        
        int[] numeros = new int[n];
        int soma = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }
        
        double media = (double) soma / n;
        
        System.out.println("Média: " + media);
        System.out.println("Números maiores que a média: ");
        
        for (int i = 0; i < n; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }
        
        sc.close();
    }
}
