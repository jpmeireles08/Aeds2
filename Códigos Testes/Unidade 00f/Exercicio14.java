import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: ");
        String nomeArquivo = sc.nextLine();
        System.out.print("Digite a frase: ");
        String frase = sc.nextLine();

        try {
            FileWriter fileWriter = new FileWriter(nomeArquivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(frase);
            bufferedWriter.close();

            System.out.println("Frase salva no arquivo com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao salvar no arquivo: " + e.getMessage());
        }

        sc.close();
    }
}