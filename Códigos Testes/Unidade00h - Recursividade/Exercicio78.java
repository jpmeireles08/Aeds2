public class Exercicio78 {
    public static int calcularTermo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return calcularTermo(n - 1) * calcularTermo(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4; 
        
        int resultado = calcularTermo(n);
        
        System.out.println("T(" + n + ") = " + resultado);
    }
}
