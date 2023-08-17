import java.util.Scanner;

public class Exercicio45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = sc.nextInt();
        
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

    
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            
            if (indiceMinimo != i) {
                int temp = array[i];
                array[i] = array[indiceMinimo];
                array[indiceMinimo] = temp;
            }
        }

        System.out.println("Array ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
