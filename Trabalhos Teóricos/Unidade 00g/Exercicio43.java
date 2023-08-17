import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        int i = 0;
        int soma = 0;

        while (2 * i + 1 < n) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = sc.nextInt();

            int proximoIndice = 2 * i + 1;
            if (proximoIndice < n) {
                int proximoNumero = numero;
                soma += numero + proximoNumero;
            }

            i++;
        }

        System.out.println("A soma dos termos é: " + soma);

        sc.close();
    }
}
