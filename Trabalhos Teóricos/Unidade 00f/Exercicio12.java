import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio12 {
    public static void main(String[] args) {
        try {
            FileReader ArqLeitura = new FileReader("arq_1.txt");
            BufferedReader scan = new BufferedReader(ArqLeitura);

            FileWriter ArqEscrita = new FileWriter("arq_1.txt");
            BufferedWriter sc = new BufferedWriter(ArqEscrita);

            String linha;

            while ((linha = scan.readLine()) != null) {
                sc.write(linha);
                sc.newLine();
            }

            sc.close();
            scan.close();

            System.out.println("Copia gerada com sucesso");
        } catch (IOException e) {
            System.err.println("Erro ao copiar: " + e.getMessage());
        }
    }
}