public class SequenciaEspelho {
    public static void main (String[] args) {
        int x = MyIO.readInt();
        int y = MyIO.readInt();
        String vetor = "";
        
        
        for (int i = x; i <= y; i++) {
            vetor = vetor + i;
            
        }
        MyIO.print(vetor);

        for (int i = 0; i < vetor.length(); i++) {
            MyIO.print(vetor.charAt(vetor.length() - i - 1));
        }
    }
}
