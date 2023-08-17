public class Retangulo {
    private double base;
    private double altura;

    public Retangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return 2 * (base + altura);
    }

    public double getDiagonal() {
        return Math.sqrt(base * base + altura * altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(8, 4);
        System.out.println("Área: " + retangulo1.getArea());
        System.out.println("Perímetro: " + retangulo1.getPerimetro());
        System.out.println("Diagonal: " + retangulo1.getDiagonal());

        Retangulo retangulo2 = new Retangulo();
        retangulo2.setBase(13);
        retangulo2.setAltura(3);
        System.out.println("Área: " + retangulo2.getArea());
        System.out.println("Perímetro: " + retangulo2.getPerimetro());
        System.out.println("Diagonal: " + retangulo2.getDiagonal());
    }
}
