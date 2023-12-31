
import java.io.RandomAccessFile;
import java.util.Date;


class Atleta {

    private int id;
    private String nome;
    private int altura;
    private int peso;
    private String universidade;
    private int anoNascimento;
    private String cidadeNascimento;
    private String estadoNascimento;

    public Atleta() {
        id = 0;
        altura = 0;
        peso = 0;
        anoNascimento = 0;
        nome = "";
        universidade = "";
        cidadeNascimento = "";
        estadoNascimento = "";
    }

    public Atleta(int id, int altura, int peso, int anoNascimento, String nome, String universidade,
            String cidadeNascimento, String estadoNascimento) {
        this.id = id;
        this.altura = altura;
        this.peso = peso;
        this.anoNascimento = anoNascimento;
        this.nome = nome;
        this.universidade = universidade;
        this.cidadeNascimento = cidadeNascimento;
        this.estadoNascimento = estadoNascimento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    public void setEstadoNascimento(String estadoNascimento) {
        this.estadoNascimento = estadoNascimento;
    }

    public int getId() {
        return id;
    }

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getUniversidade() {
        return universidade;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public String getEstadoNascimento() {
        return estadoNascimento;
    }

    public void imprimirDados() {
        System.out.println("[" + getId() + " ## " + getNome() + " ## " + getAltura() + " ## " + getPeso()
                + " ## " + getAnoNascimento() + " ## " + getUniversidade() + " ## " + getCidadeNascimento() + " ## " +
                getEstadoNascimento() + "]");
    }

    public Atleta clone() {
        Atleta clone = new Atleta(id, altura, peso, anoNascimento, nome, universidade, cidadeNascimento,
                estadoNascimento);
        return clone;
    }

    public void lerDados(String id) throws Exception {

        RandomAccessFile arqJogador = new RandomAccessFile(
                "/tmp/players.csv", "r");

        String linha;

        arqJogador.seek(60);

        while ((linha = arqJogador.readLine()) != null) {
            String[] identificador = linha.split(",");

            while (identificador.length < 8) {
                linha += ", ";
                identificador = linha.split(",");
            }

            if (identificador.length >= 8 && identificador[0].equals(id)) {
                setId(Integer.parseInt(id));
                setNome(identificador[1]);
                setAltura(Integer.parseInt(identificador[2]));
                setPeso(Integer.parseInt(identificador[3]));
                setAnoNascimento(Integer.parseInt(identificador[5]));

                if (identificador[6].isEmpty() || identificador[6].equals("")) {
                    setCidadeNascimento("nao informado");
                } else {
                    setCidadeNascimento(identificador[6]);
                }

                if (identificador[7].isEmpty() || identificador[7].equals("")) {
                    setEstadoNascimento("nao informado");
                } else {
                    setEstadoNascimento(identificador[7]);
                }

                if (identificador[4].isEmpty() || identificador[4].equals("")) {
                    setUniversidade(("nao informado"));
                } else {
                    setUniversidade(identificador[4]);
                }

                break;
            }
        }

        arqJogador.close();
    }

}

public class Sequencial {
    public static void main(String[] args) throws Exception {

        Date novo = new Date();

        Atleta jogadores[] = new Atleta[3922];
        String id = MyIO.readLine();
        int i = 0;

        while (!comparaString(id, "FIM")) {
            jogadores[i] = new Atleta();
            jogadores[i].lerDados(id);
            id = MyIO.readLine();
            i++;
        }

        for (int j = 0; j < 3922; j++) {
            if (jogadores[j] == null) {
                jogadores[j] = new Atleta();
            }
        }

        String nomeJogador = MyIO.readLine();
        int cont = 0;

        while (!comparaString(nomeJogador, "FIM")) {
            boolean aux = false;
            for (int j = 0; j < 3922; j++) {
                if (nomeJogador.equals(jogadores[j].getNome())) {
                    MyIO.println("SIM");
                    j = 3922;
                    aux = true;
                    cont++;

                } else {
                    cont++;
                }
                
            }
            if (aux == false) {
                MyIO.println("NAO");
            }


            nomeJogador = MyIO.readLine();

        }

        Date fim = new Date();

        long tempoExec = fim.getTime() - novo.getTime();

        log(tempoExec, cont);

    }

    public static void log(long tempoExecucao, int cont) throws Exception {
        RandomAccessFile escritor = new RandomAccessFile("matrícula_sequencial.txt", "rw");
        escritor.writeBytes("802151\t" + tempoExecucao + "\t" + cont);
        escritor.close();
    }

    public static boolean comparaString(String palavra1, String palavra2) {
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        for (int i = 0; i < palavra2.length(); i++) {
            if (palavra1.charAt(i) != palavra2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

}
