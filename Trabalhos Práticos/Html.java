import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Html {

    // Metodo que recebe uma url e um nome da pagina, lê o conteudo linha por linha
    // da pagina e contabiliza
    // os caracteres
    public static void contarCaracteres(String endereco, String nomeDaPagina) {
        try {
            URL url = new URL(endereco);
            try (InputStream is = url.openStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

                int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
                int contAcentoA = 0, contAcentoE = 0, contAcentoI = 0, contAcentoO = 0, contAcentoU = 0;
                int contGraveA = 0, contGraveE = 0, contGraveI = 0, contGraveO = 0, contGraveU = 0;
                int contTildeA = 0, contTildeO = 0, contCircumflexA = 0, contCircumflexE = 0, contCircumflexI = 0,
                        contCircumflexO = 0, contCircumflexU = 0;
                int contConsoantes = 0;
                int contBR = 0, contTable = 0;

                String line;
                while ((line = br.readLine()) != null) {
                    for (int i = 0; i < line.length(); i++) {
                        char c = line.charAt(i);
                        if (Character.isLetter(c)) {
                            switch (c) {
                                case 'a':
                                    contA++;
                                    break;
                                case 'e':
                                    contE++;
                                    break;
                                case 'i':
                                    contI++;
                                    break;
                                case 'o':
                                    contO++;
                                    break;
                                case 'u':
                                    contU++;
                                    break;
                                case '\u00E1':
                                    contAcentoA++;
                                    break;
                                case '\u00E9':
                                    contAcentoE++;
                                    break;
                                case '\u00ED':
                                    contAcentoI++;
                                    break;
                                case '\u00F3':
                                    contAcentoO++;
                                    break;
                                case '\u00FA':
                                    contAcentoU++;
                                    break;
                                case '\u00E0':
                                    contGraveA++;
                                    break;
                                case '\u00E8':
                                    contGraveE++;
                                    break;
                                case '\u00EC':
                                    contGraveI++;
                                    break;
                                case '\u00F2':
                                    contGraveO++;
                                    break;
                                case '\u00F9':
                                    contGraveU++;
                                    break;
                                case '\u00E3':
                                    contTildeA++;
                                    break;
                                case '\u00F5':
                                    contTildeO++;
                                    break;
                                case '\u00E2':
                                    contCircumflexA++;
                                    break;
                                case '\u00EA':
                                    contCircumflexE++;
                                    break;
                                case '\u00EE':
                                    contCircumflexI++;
                                    break;
                                case '\u00F4':
                                    contCircumflexO++;
                                    break;
                                case '\u00FB':
                                    contCircumflexU++;
                                    break;
                                case 60:
                                    if (line.charAt(i + 1) == 98 && line.charAt(i + 2) == 114
                                            && line.charAt(i + 3) == 62) {
                                        contBR++;
                                    } else if (line.charAt(i + 1) == 116 && line.charAt(i + 2) == 97
                                            && line.charAt(i + 3) == 98 && line.charAt(i + 4) == 108
                                            && line.charAt(i + 5) == 101 &&
                                            line.charAt(i + 6) == 62) {
                                        contTable++;
                                    }
                                    break;

                                default:
                                    if (c >= 'b' && c <= 'z') {
                                        contConsoantes++;
                                    }
                                    break;
                            }
                        }
                    }

                }

                MyIO.println("a(" + contA + ") e(" + contE + ") i(" + contI + ") o(" + contO + ") u(" + contU + ") " +
                        "á(" + contAcentoA + ") é(" + contAcentoE + ") í(" + contAcentoI + ") ó(" + contAcentoO + ") ú("
                        + contAcentoU + ") " +
                        "à(" + contGraveA + ") è(" + contGraveE + ") ì(" + contGraveI + ") ò(" + contGraveO + ") ù("
                        + contGraveU + ") " +
                        "ã(" + contTildeA + ") õ(" + contTildeO + ") â(" + contCircumflexA + ") ê(" + contCircumflexE
                        + ") î(" + contCircumflexI + ") " +
                        "ô(" + contCircumflexO + ") û(" + contCircumflexU + ") consoante(" + contConsoantes + ") " +
                        "<br>(" + contBR + ") <table>(" + contTable + ")" + " " + nomeDaPagina);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String nomeDaPagina, endereco;

        nomeDaPagina = MyIO.readLine();

        while (!fim(nomeDaPagina)) {
            endereco = MyIO.readLine();

            contarCaracteres(endereco, nomeDaPagina);

            nomeDaPagina = MyIO.readLine();
        }

    }

    // Método para verificar se a palavra digitada foi "FIM", e caso seja, parar o
    // código //
    public static boolean fim(String nomeDaPagina) {
        String fim = "FIM";
        if (nomeDaPagina.length() != fim.length()) {
            return false;
        }

        for (int i = 0; i < fim.length(); i++) {
            if (nomeDaPagina.charAt(i) != fim.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
