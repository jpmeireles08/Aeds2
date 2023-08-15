import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = sc.nextDouble();

        double limitePrestacao = salarioBruto * 0.4;

        if (valorPrestacao <= limitePrestacao) {
            System.out.println("Empréstimo concedido");
        } else {
            System.out.println("Empréstimo não concedido. O valor passa do limite.");
        }

        sc.close();
    }
}
