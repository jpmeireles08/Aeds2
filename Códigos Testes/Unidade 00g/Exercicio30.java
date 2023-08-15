import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numer: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = sc.nextDouble();

        double menorNumero = Math.min(num1, num2);
        double maiorNumero = Math.max(num1, num2);

        double raizCubicaMenor = Math.cbrt(menorNumero);
        double logaritmoMenor = Math.log(menorNumero) / Math.log(maiorNumero);

        System.out.println("Raiz cúbica do menor numero: " + raizCubicaMenor);
        System.out.println("Logaritmo do menor numero na base do maior numero: " + logaritmoMenor);

        sc.close();
    }
}
