import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        
        double media = soma / notas.length;
        
        double menorNota = notas[0];
        for (double nota : notas) {
            if (nota < menorNota) {
                menorNota = nota;
            }
        }
        
        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);
        System.out.println("Menor nota: " + menorNota);
        
        sc.close();
    }
}
