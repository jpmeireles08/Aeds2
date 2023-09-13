public class IdadeMonica {
    public static void main (String[] args) {
        int m = MyIO.readInt();
        int a = MyIO.readInt();
        int b = MyIO.readInt();
        int c = 0;

        if (m >= 44 && m <= 110 && a >= 1 && a < m && b >= 1 && b < m && a != b) {
            c = m - a - b;
            if (a > b && a > c) {
                MyIO.print(a);
            } else if (b > a && b > c) {
                MyIO.print(b);
            } else {
                MyIO.print(c);
            }
        }
    }
}
