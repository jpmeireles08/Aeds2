public class PalindromoRecursivo {
    public static void main(String[] args) {
        String palavra = MyIO.readLine();
        
        while (!fim(palavra)) {

            int tamanho = palavra.length();
            int x = 0;
            boolean palindromo = isPalindromo(palavra, tamanho, x);

            if (palindromo) {
                MyIO.println("SIM");
                palavra = MyIO.readLine();
                tamanho = palavra.length();
            } else {
                MyIO.println("NAO");
                palavra = MyIO.readLine();
                tamanho = palavra.length();
            }
        }
    }

    // Metodo recursivo para verificar se a palavra é um palíndromo //
    public static boolean isPalindromo(String palavra, int tamanho, int x) {
        if (x == palavra.length()) {
            return true;
        } else {
            if (palavra.charAt(x) == palavra.charAt(tamanho - x - 1)) {
                return isPalindromo(palavra, tamanho, x + 1);
            } else {
                return false;
            }
        }
        
    }

    // Método para verificar se a palavra digitada foi "FIM", e caso seja, parar o código //
    public static boolean fim (String palavra) {
        String fim = "FIM";
        if (palavra.length() != fim.length()) {
            return false;
        }

        for (int i = 0; i < fim.length(); i++) {
            if (palavra.charAt(i) != fim.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
