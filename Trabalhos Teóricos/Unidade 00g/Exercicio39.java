import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        int n;
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual termo da sequencia de fibonacci deseja verificar: ");
        n = sc.nextInt();
        b = 1;
        a = 0;
        c = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("O numero " + n + " da sequencia e o: " + a);
    
        sc.close();
    }
}
