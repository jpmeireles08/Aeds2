import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        int vetor[] = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota do aluno " + (i+1) + ":");
            vetor[i] = sc.nextInt();

        }
        double soma = 0; 
        double media = 0;
        for (int i = 0; i < 5; i++) {
            soma += vetor[i];
        }

        media = soma / 5;

        System.out.println("A media das notas: " + media);

        sc.close();
    }
}
