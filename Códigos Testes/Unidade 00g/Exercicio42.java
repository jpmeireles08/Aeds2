import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeroAlunos = 5;
        String[] nomes = new String[numeroAlunos];
        double[] notas = new double[numeroAlunos];
        double somaNotas = 0.0;
        
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.next();
            
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            
            somaNotas += notas[i];
        }
        
        double media = somaNotas / numeroAlunos;
        
        System.out.println("Média do grupo: " + media);
        System.out.println("Alunos acima da média:");
        
        for (int i = 0; i < numeroAlunos; i++) {
            if (notas[i] > media) {
                System.out.println(nomes[i]);
            }
        }
        
        sc.close();
    }
}
