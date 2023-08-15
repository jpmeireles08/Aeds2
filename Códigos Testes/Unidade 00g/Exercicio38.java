import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a nota máxima (N): ");
        int notaMaxima = sc.nextInt();
        
        int numeroAlunos = 20;
        int[] notas = new int[numeroAlunos];
        int somaNotas = 0;
        
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            int nota = sc.nextInt();
            notas[i] = nota;
            somaNotas += nota;
        }
        
        double mediaTurma = (double) somaNotas / numeroAlunos;
        int abaixoMedia = 0;
        int conceitoA = 0;
        
        for (int i = 0; i < numeroAlunos; i++) {
            if (notas[i] < mediaTurma) {
                abaixoMedia++;
            }
            if (notas[i] > 0.9 * notaMaxima) {
                conceitoA++;
            }
        }
        
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Número de alunos abaixo da média: " + abaixoMedia);
        System.out.println("Quantidade de alunos com conceito A: " + conceitoA);
        
        sc.close();
    }
}
