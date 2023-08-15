public class Exercicio79 {
    public static void moverTorre(int discos, char torreOrigem, char torreDestino, char torreAuxiliar) {
        if (discos == 1) {
            System.out.println("Mover disco 1 da torre " + torreOrigem + " para a torre " + torreDestino);
            return;
        }
        
        moverTorre(discos - 1, torreOrigem, torreAuxiliar, torreDestino);
        System.out.println("Mover disco " + discos + " da torre " + torreOrigem + " para a torre " + torreDestino);
        moverTorre(discos - 1, torreAuxiliar, torreDestino, torreOrigem);
    }

    public static void main(String[] args) {
        int discos = 9; 
        moverTorre(discos, 'A', 'C', 'B');
    }
}
