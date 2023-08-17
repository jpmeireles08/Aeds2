import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercicio13 {
    public static void main(String[] args) {
        try {
            RandomAccessFile aleatoriaFile = new RandomAccessFile("dados.bin", "rw");
            aleatoriaFile.writeInt(42);
            aleatoriaFile.writeDouble(3.14);
            aleatoriaFile.writeUTF("Hello, world!");
            aleatoriaFile.seek(4);
            double dbl = aleatoriaFile.readDouble();
            System.out.println("Double lido: " + dbl);
            aleatoriaFile.seek(12);
            String mensagem = aleatoriaFile.readUTF();
            System.out.println("String lida: " + mensagem);
            aleatoriaFile.seek(0);
            int valorInt = aleatoriaFile.readInt();
            System.out.println("Int lido: " + valorInt);
            aleatoriaFile.close();
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}