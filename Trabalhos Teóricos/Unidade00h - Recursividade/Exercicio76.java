public class Exercicio76 {
    public static void ordenar(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        
        ordenar(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {15, 22, 29, 41, 32, 52};
        
        ordenar(arr, arr.length);

        System.out.println("\nArray ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
