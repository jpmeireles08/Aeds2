public class Exercicio71 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 13;

        int resultado = multiplicacao(num1, num2);

        System.out.println("Resultado: " + resultado);
    }

    public static int multiplicacao(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        
        if (num2 > 0) {
            return num1 + multiplicacao(num1, num2 - 1);
        } else {
            return -multiplicacao(num1, -num2);
        }
    }
}
