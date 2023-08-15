import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);

        while (num < 20) {
            num +=2;
            System.out.println(num);
        }
        sc.close();
    }
}