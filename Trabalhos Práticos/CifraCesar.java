public class CifraCesar {
    public static void main (String[] args) {
        String palavra = MyIO.readLine();
        int tamanho = palavra.length();

        while (!fim(palavra)) {
            isCiframento(palavra, tamanho);
            palavra = MyIO.readLine();
            tamanho = palavra.length();
        }
    }

    // Método para substituir o caractere pelo caractere da sua terceira casa a frente //
    public static void isCiframento (String palavra, int tamanho) {
        int caractere;
        for (int i = 0; i < tamanho; i++) {
            caractere = (int)palavra.charAt(i) + 3;
            MyIO.print((char)caractere);
        }
        MyIO.println("");
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
