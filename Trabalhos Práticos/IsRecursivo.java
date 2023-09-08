public class IsRecursivo {
    public static void main(String[] args) {
        String palavra = MyIO.readLine();
        boolean isvogal = vogais(palavra, 0);
        boolean isconsoante = consoantes(palavra, 0);
        boolean isinteiro = inteiros(palavra, 0);
        boolean isreal = reais(palavra, 0, 0);

        while (!fim(palavra)) {
            if (isvogal) {
                MyIO.print("SIM ");
            } else {
                MyIO.print("NAO ");
            }

            if (isconsoante) {
                MyIO.print("SIM ");
            } else {
                MyIO.print("NAO ");
            }

            if (isinteiro) {
                MyIO.print("SIM ");
            } else {
                MyIO.print("NAO ");
            }

            if (isreal) {
                MyIO.print("SIM ");
            } else {
                MyIO.print("NAO ");
            }

            MyIO.print("\n");
            palavra = MyIO.readLine();
            isvogal = vogais(palavra, 0);
            isconsoante = consoantes(palavra, 0);
            isinteiro = inteiros(palavra, 0);
            isreal = reais(palavra, 0, 0);
        }
    }

    public static boolean vogais(String palavra, int i) {
        if (i == palavra.length()) {
            return true;
        } else {
            int w = palavra.charAt(i);
            if (w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u' || w == 'A' || w == 'E'
                    || w == 'I' || w == 'O' || w == 'U') {
                return vogais(palavra, i + 1);
            } else {
                return false;
            }
        }
    }

    public static boolean consoantes(String palavra, int i) {
        if (i == palavra.length()) {
            return true;
        } else {
            int x = palavra.charAt(i);
            if (x >= (char) 65 && x <= (char) 90 || x >= (char) 97 && x <= (char) 122 && x != (char) 65
                    && x != (char) 69 && x != (char) 73 && x != (char) 79 && x != (char) 85 && x != (char) 97
                    && x != (char) 101 && x != (char) 105 && x != (char) 111 && x != (char) 117) {
                return consoantes(palavra, i + 1);
            } else {
                return false;
            }
        }
    }

    public static boolean inteiros(String palavra, int i) {
        if (i == palavra.length()) {
            return true;
        } else {
            int y = palavra.charAt(i);
            if (y >= (char) 48 && y <= (char) 57) {
                return inteiros(palavra, i + 1);
            } else {
                return false;
            }
        }
    }

    public static boolean reais(String palavra, int i, int virgulactr) {
        if (i == palavra.length()) {
            return true;
        } else {
            int z = palavra.charAt(i);
            if (z >= (char) 48 && z <= (char) 57) {
                return reais(palavra, i + 1, virgulactr);
            } else if ((z == (char) 44 || z == (char) 46) && virgulactr < 1) {
                return reais(palavra, i + 1, virgulactr + 1);
            } else
                return false;
        }
    }

    public static boolean fim (String palavra) {
        String fim = "FIM";
        if (palavra.length() != fim.length()) {
            return false;
        }

        for (int i = 0; i < fim.length(); i++) {
            if (palavra.charAt(i) != fim.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
