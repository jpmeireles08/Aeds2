public class Exercicio75 {
    public static void main(String[] args) {
        String texto = "Joao Pedro de Meireles";

        int quantidadeCaracteres = contarCaracteres(texto, 0);

        System.out.println("A quantidade de caracteres não vogais e não consoantes maiúsculas é: " + quantidadeCaracteres);
    }

    public static int contarCaracteres(String texto, int indice) {
        if (indice >= texto.length()) {
            return 0;
        }

        char caractere = texto.charAt(indice);
        int caracteresRestantes = contarCaracteres(texto, indice + 1);

        if (!isVogal(caractere) && !isConsoanteMaiuscula(caractere)) {
            return 1 + caracteresRestantes;
        } else {
            return caracteresRestantes;
        }
    }

    public static boolean isVogal(char c) {
        char caracter = Character.toLowerCase(c);
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }

    public static boolean isConsoanteMaiuscula(char c) {
        return Character.isUpperCase(c) && !isVogal(c);
    }
}
