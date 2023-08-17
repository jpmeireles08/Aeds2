import java.io.*;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {   
        String Arq;
        Scanner sc = new Scanner(System.in);
        Arq = sc.nextLine();
        sc.close();

        try {
            FileReader fileReader = new FileReader(Arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            StringBuilder conteudoCriptografado = new StringBuilder();

            while ((linha = bufferedReader.readLine()) != null) {
                String linhaCriptografada = ciframentoCesar(linha, 3);
                conteudoCriptografado.append(linhaCriptografada).append("\n");
            }

            bufferedReader.close();

            System.out.println("Conteudo criptografado corretamente: ");
            System.out.println(conteudoCriptografado.toString());
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        sc.close();
    }

    private static String ciframentoCesar(String texto, int deslocamento) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (Character.isLetter(caractere)) {
                char novoCaractere = (char) (((caractere - 'a' + deslocamento) % 26) + 'a');
                result.append(novoCaractere);
            } else {
                result.append(caractere);
            }
        }

        return result.toString();
    }
}