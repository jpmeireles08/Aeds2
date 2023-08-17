import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        String arq, arq2;

        Scanner sc = new Scanner(System.in);
        arq = sc.nextLine();
        arq2 = sc.nextLine();
        sc.close();

        try {
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(arq2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                String linhaMaiuscula = linha.toUpperCase();
                bufferedWriter.write(linhaMaiuscula);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            bufferedReader.close();

            System.out.println("Conteúdo convertido e salvo com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao converter e salvar o conteúdo: " + e.getMessage());
        }

        sc.close();
    }
}