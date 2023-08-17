import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        int x, y, z;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        x = scanner.nextInt();
        System.out.print("Digite o valor de y: ");
        y = scanner.nextInt();
        System.out.print("Digite o valor de z: ");
        z = scanner.nextInt();

        if (x <= y + z && y <= x + z && z <= y + x && x > 0 && y > 0 && z > 0) {
            System.out.println("\nEstas medidas são aceitáveis para a formação de um triângulo\n");

            if (x == y && y == z) {
                System.out.println("O triângulo formado é equilátero");
            } else if (x > y && y > z) {
                System.out.println("O triângulo formado é escaleno");
            } else if (x > z && z > y) {
                System.out.println("O triângulo formado é escaleno");
            } else if (y > x && x > z) {
                System.out.println("O triângulo formado é escaleno");
            } else if (y > z && z > x) {
                System.out.println("O triângulo formado é escaleno");
            } else if (z > x && x > y) {
                System.out.println("O triângulo formado é escaleno");
            } else if (z > y && y > x) {
                System.out.println("O triângulo formado é escaleno");
            } else if (x == y && x > z) {
                System.out.println("O triângulo formado é isósceles");
            } else if (x == y && x < z) {
                System.out.println("O triângulo formado é isósceles");
            } else if (y == z && y > x) {
                System.out.println("O triângulo formado é isósceles");
            } else if (y == z && y < x) {
                System.out.println("O triângulo formado é isósceles");
            } else if (z == x && z > y) {
                System.out.println("O triângulo formado é isósceles");
            } else if (z == x && z < y) {
                System.out.println("O triângulo formado é isósceles");
            }
        }
        else {
            System.out.println("\nEstas medidas não podem ser usadas para a formação de um triângulo");
        }
        scanner.close();
    }
}