import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        String nomeArq, nomeArq2;

        Scanner sc = new Scanner(System.in);
        nomeArq = sc.nextLine();
        nomeArq2 = sc.nextLine();
        sc.close();

        try {
            FileReader fileReader = new FileReader(nomeArq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(nomeArq2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                bufferedWriter.write(linha);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            bufferedReader.close();

            System.out.println("Conteudo copiado com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao copiar conteudo: " + e.getMessage());
        }
    }
}