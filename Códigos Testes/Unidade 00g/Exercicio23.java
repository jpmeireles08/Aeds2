import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        int nota = sc.nextInt();
        sc.nextLine();

        if (nota >= 80) {
            System.out.println("Parabens, muito bom");
        }
        else if (nota >= 70 && nota < 80) {
            System.out.println("Parabens, aprovado");
        }
        else {
            System.out.println("Infelizmente, reprovado");
        }
        sc.close();
    }
}
