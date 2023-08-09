import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        int x, y, z;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        x = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        y = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        z = sc.nextInt();

        int menor = x;
        if (y < x) {
            menor = y;
        }
        if (z < menor) {
            menor = z;
        }

        int maior = x;
        if (y > x) {
            maior = y;
        }
        if (z > maior) {
            maior = z;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}
