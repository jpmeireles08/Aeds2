import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeroAlunos = 5;
        double somaNotas = 0.0;
        
        for (int i = 1; i <= numeroAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = sc.nextDouble();
            somaNotas += nota;
        }
        
        double media = somaNotas / numeroAlunos;
        
        System.out.println("Média das notas: " + media);
        
        sc.close();
    }
}
