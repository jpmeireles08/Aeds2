public class Palindromo {
    public static void main (String[] args) {
        String palavra = MyIO.readLine();
        int tamanho = palavra.length();
        // Usei a estrutura while para chamar o método e rodar até que a palavra digitada seja "FIM" //
        while (!fim(palavra)) {
            isPalindromo(palavra, tamanho);
            palavra = MyIO.readLine();
            tamanho = palavra.length();
        }
    }
       
    // Método para verificar se a palavra inserida é ou não um palíndromo //
    public static void isPalindromo(String palavra, int tamanho) { 
        boolean resp = true;
        
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == palavra.charAt(tamanho - i - 1)) {

            }  else resp = false;
        }
        
        if (resp == true) {
            MyIO.println("SIM");
        } else MyIO.println("NAO");
        
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
