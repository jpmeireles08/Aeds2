public class Is {
    public static void main(String[] args) {
        String palavra = MyIO.readLine();
        int tamanho = palavra.length();
        
        while (!fim(palavra)) {
            vogais(palavra, tamanho);
            consoante(palavra, tamanho);
            inteiro(palavra, tamanho);
            real(palavra, tamanho);
            palavra = MyIO.readLine();
            tamanho = palavra.length();
        }
    }

    /* Método para verificar se a string é composta apenas por vogais */
    public static void vogais (String palavra, int tamanho) {
        int cont1 = 0;
        for (int i = 0; i < tamanho; i++) {
            int w = palavra.charAt(i);
            if (w == 'a'|| w == 'e' || w == 'i' || w == 'o' || w == 'u' || w == 'A' || w == 'E' 
            || w == 'I' || w == 'O' || w == 'U') {
                cont1++;
            } 
        }

        if (cont1 == tamanho) {
                MyIO.print("SIM ");
            } else {
                MyIO.print("NAO ");
            }
    }

    /* Método para verificar se a String é composta apenas por consoantes */
    public static void consoante (String palavra, int tamanho) {
        int cont2 = 0;
        for (int i = 0; i < tamanho; i++) {
            int x = palavra.charAt(i);
            if (x >= (char)65 && x <= (char)90 || x >= (char)97 && x <= (char)122 && x != (char)65 
            && x != (char)69 && x != (char)73 && x != (char)79 && x != (char)85 && x != (char)97 
            && x != (char)101 && x != (char)105 && x != (char)111 && x != (char)117) {
                cont2++;
            }
        }

        if (cont2 == tamanho) {
            MyIO.print("SIM ");
        } else {
            MyIO.print("NAO ");
        }
    }

    /* Método para verificar se a string possui apenas numeros inteiros */
    public static void inteiro (String palavra, int tamanho) {
        int cont3 = 0;
        for (int i = 0; i < tamanho; i++) {
            int y = palavra.charAt(i);
            if (y >= (char)48 && y <= (char) 57) {
                cont3++;
            }
        }

        if (cont3 == tamanho) {
            MyIO.print(("SIM "));
        } else {
            MyIO.print("NAO ");
        }
    }

    /* Método para verificar se a string possui apenas numeros reais */
    public static void real (String palavra, int tamanho) {
        int cont4 = 0;
        for (int i = 0; i < tamanho; i++) {
            int z = palavra.charAt(i);
            if (z >= (char)48 && z <= (char) 57) {
                cont4++;
            }
        }
        for (int j = 0; j < tamanho; j++) {
            int z = palavra.charAt(j);
            if (z == (char) 44 || z == (char)46) {
                cont4++;
                j = tamanho;
            }
        }

        if (cont4 == tamanho) {
            MyIO.print(("SIM "));
        } else {
            MyIO.print("NAO ");
        }

        MyIO.print("\n");
    }

    // Método para verificar se a palavra digitada foi "FIM", e caso seja, parar o código //
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
