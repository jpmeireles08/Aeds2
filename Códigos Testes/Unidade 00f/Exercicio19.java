import java.io.*;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        String Arq, Arq2;

        Scanner sc = new Scanner(System.in);
        Arq = sc.nextLine();
        Arq2 = sc.nextLine();
        sc.close();

        try {
            FileReader fileReader = new FileReader(Arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(Arq2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                String linhaInvertida = new StringBuilder(linha).reverse().toString();
                bufferedWriter.write(linhaInvertida);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            bufferedReader.close();

            System.out.println("Sucesso ao inventer e copiar conteudo.");
        } catch (IOException e) {
            System.err.println("Erro ao inverter e copiar o conteudo: " + e.getMessage());
        }

        sc.close();
    }
}