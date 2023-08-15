public class Exercicio72 {
    public static void main(String[] args) {
        int[] array = { 76, 35, 28, 12, 3 };
        int tamanho = array.length;

        int maior = maiorElemento(array, tamanho);

        System.out.println("O maior elemento do array é: " + maior);
    }

    public static int maiorElemento(int[] array, int tamanho) {
        if (tamanho == 1) {
            return array[0];
        } else {
            int maiorRestante = maiorElemento(array, tamanho - 1);
            if (maiorRestante > array[tamanho - 1]) {
                return maiorRestante;
            } else {
                return array[tamanho - 1];
            }
        }
    }
}
