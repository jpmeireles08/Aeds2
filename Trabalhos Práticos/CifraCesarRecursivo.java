public class CifraCesarRecursivo {
    public static void main (String[] args) {
        String palavra = MyIO.readLine();
        int tamanho = palavra.length();
    
        while (!fim(palavra)) {
            isCiframento(palavra, tamanho, 0);
            MyIO.println("");
            palavra = MyIO.readLine();
            tamanho = palavra.length();
        }
    }

    /* Método recursivo para fazer a "criptografia" de cada letra da palavra */
    public static boolean isCiframento (String palavra, int tamanho, int x) {
        int caractere;
        if (x == tamanho) {
            return true;
        } else {
            caractere = (int)palavra.charAt(x) + 3;
            MyIO.print((char)caractere);
            isCiframento(palavra, tamanho, x + 1);
            } 
            return false;
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
