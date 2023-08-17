import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Exercicio15 {
    public static void main(String[] args)
    {
        String texto;
        try
        {
        FileReader ArqLeitura = new FileReader("arquivo.txt");
        BufferedReader sc = new BufferedReader(ArqLeitura, 100);
        texto = sc.readLine();
        System.out.println(texto);
        ArqLeitura.close();
        }
        catch (IOException x)
        {
            System.out.println("Erro ao executar: " + x.getMessage());
        }
    }    
}