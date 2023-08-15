import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > 45 || num2 > 45) {
            int soma = num1 + num2;
            System.out.println("A soma dos números é: " + soma);
        } else if (num1 > 20 && num2 > 20) {
            int subtracao = Math.max(num1, num2) - Math.min(num1, num2);
            System.out.println("A subtração do maior pelo menor é: " + subtracao);
        } else if ((num1 < 10 && num1 != 0) || (num2 < 10 && num2 != 0)) {
            if (num2 == 0) {
                System.out.println("Não é possível realizar a divisão por zero.");
            } else {
                double divisao = (double) num1 / num2;
                System.out.println("A divisão do primeiro pelo segundo é: " + divisao);
            }
        } else {
            System.out.println("João Pedro");
        }

        sc.close();
    }
}
