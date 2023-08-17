import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        int n;
        int x = 1;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para N: ");
        n = sc.nextInt();
        while (i < n) {
            System.out.println(x);
            x+=2;
            i++;
        }

        sc.close();
    }
}
