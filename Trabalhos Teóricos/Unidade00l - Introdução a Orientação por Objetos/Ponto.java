public class Ponto {
    private double x;
    private double y;
    private int id;
    private static int nextID = 0;

    public Ponto() {
        this.x = 0;
        this.y = 0;
        this.id = nextID;
        nextID++;
    }

    public Ponto(double x, double y) {
        this.x = 0;
        this.y = 0;
        this.id = nextID;
        nextID++;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        System.out.println("Ponto 1 - ID: " + ponto1.getId() + ", x: " + ponto1.getX() + ", y: " + ponto1.getY());

        Ponto ponto2 = new Ponto(3.5, 2.0);
        System.out.println("Ponto 2 - ID: " + ponto2.getId() + ", x: " + ponto2.getX() + ", y: " + ponto2.getY());
    }
}
