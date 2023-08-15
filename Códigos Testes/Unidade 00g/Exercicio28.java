import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de gols do mandante: ");
        int golsMandante = sc.nextInt();

        System.out.print("Digite o número de gols do visitante: ");
        int golsVisitante = sc.nextInt();

        if (golsMandante > golsVisitante) {
            System.out.println("Vitória do mandante!");
        } else if (golsVisitante > golsMandante) {
            System.out.println("Vitória do visitante!");
        } else {
            System.out.println("Empate");
        }

        sc.close();
    }
}
