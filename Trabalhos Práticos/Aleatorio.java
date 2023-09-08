import java.util.Random;

public class Aleatorio {
    public static void main (String[] args) {
        String palavra = MyIO.readLine();
        Random gerador = new Random();
        gerador.setSeed(4);
        while (!fim(palavra)) {
            MyIO.println(sorteador(palavra, gerador));
            palavra = MyIO.readLine();
        }
    }

    // Metodo recebe uma string e um random (para gerar de forma "aleatoria" o caractere a ser substituido) //
    // Caso uma letra da palavra
    public static String sorteador(String palavra, Random gerador) {
        int x = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
        int y = (char)('a' + (Math.abs(gerador.nextInt()) % 26));

        char[] caracteres = palavra.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            if (palavra.charAt(i) == (char)x) {
                caracteres[i] = (char)y;
            }
        }

        return new String(caracteres);
    }

    // Verifica se a palavra digitada foi "FIM" para parar o programa //
    public static boolean fim (String palavra) {
        String fim = "FIM";
        if (palavra.length() != fim.length()) {
            return false;
        }

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != fim.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
