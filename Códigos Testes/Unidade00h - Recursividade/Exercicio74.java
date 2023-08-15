public class Exercicio74 {
    public static void main(String[] args) {
        char[] palavra = {'p', 'e', 'i', 'x', 'e'};

        int quantidadeVogais = vogais(palavra, 0, palavra.length - 1);

        System.out.println("A quantidade de vogais na palavra é: " + quantidadeVogais);
    }

    public static int vogais(char[] palavra, int inicio, int fim) {
        if (inicio > fim) {
            return 0;
        }

        char caractere = Character.toLowerCase(palavra[inicio]);
        int vogaisRestantes = vogais(palavra, inicio + 1, fim);

        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
            return 1 + vogaisRestantes;
        } else {
            return vogaisRestantes;
        }
    }
}
