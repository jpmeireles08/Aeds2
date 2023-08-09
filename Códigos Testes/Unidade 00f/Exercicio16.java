import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        String nomeArquivo;
        Scanner sc = new Scanner(System.in);
        nomeArquivo = sc.nextLine();
        sc.close();

        try {
            FileReader fileReader = new FileReader(nomeArquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                String maiuscula = linha.toUpperCase();
                System.out.println(maiuscula);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

