import java.io.FileWriter;
import java.io.IOException;

public class Exercicio11 {
    public static void main(String[] args) {

        
        try {
            FileWriter arqEscrita = new FileWriter("exemplo.txt");
            arqEscrita.write("123 abc AABBCC");
            arqEscrita.close();
            System.out.println("Conteudo escrito com sucesso no arquivo.");
        } catch (IOException x) {
            System.err.println("Erro na hora de escrever no arquivo: " + x.getMessage());
        }
    }
}