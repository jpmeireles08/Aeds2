import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro N: ");
        int n = sc.nextInt();
        
        int x = 1;
        int i = 0;
        
        while (i < n) {
            System.out.print(x + " ");
            
            if (i % 2 == 0) {
                x += 4;
            } else {
                x += 7;
            }
            
            i++;
        }
        
        sc.close();
    }
}
