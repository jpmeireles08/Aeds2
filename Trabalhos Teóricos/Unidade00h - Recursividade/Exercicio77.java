public class Exercicio77 {
    public static int calcularTermo(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 2;
        } else {
            return calcularTermo(n - 1) * calcularTermo(n - 2) - calcularTermo(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 1; 
        
        int resultado = calcularTermo(n);
        
        System.out.println("T(" + n + ") = " + resultado);
    }
}
