public class Lixao {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(10, 2);
        Retangulo retangulo2 = new Retangulo(7, 9);

        System.out.println("Retangulo 1:");
        System.out.println("Área: " + retangulo1.getArea());
        System.out.println("Perímetro: " + retangulo1.getPerimetro());
        System.out.println("Diagonal: " + retangulo1.getDiagonal());

        System.out.println("\nRetangulo 2:");
        System.out.println("Área: " + retangulo2.getArea());
        System.out.println("Perímetro: " + retangulo2.getPerimetro());
        System.out.println("Diagonal: " + retangulo2.getDiagonal());
    }
}
