import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor:");
        int n = sc.nextInt();
        sc.nextLine();
        int vetor[] = new int[n];
        System.out.println("Informe os numeros do vetor:");
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Escolha um numero para verificar:");
        int num = sc.nextInt();
        sc.nextLine();
        comparar(vetor, num);
        sc.close();
    }

    static void comparar(int vetor[], int comparar) {
        boolean existe = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == comparar) {
                existe = true;
                break;
            }
        }

        if (existe == true) {
            System.out.println("O numero " + comparar + " existe nesse vetor");
        } else {
            System.out.println("O numero " + comparar + " nao existe nesse vetor");
        }
    }
}