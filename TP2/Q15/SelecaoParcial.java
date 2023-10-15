
import java.util.Date;
import java.io.*;

class SelecaoParcial {

    public static int mov = 0, comp = 0;
    public static SelecaoParcial[] Jogadores;

    private int id;
    private int altura;
    private int peso;
    private int anoNascimento;
    private String nome;
    private String universidade;
    private String cidadeNascimento;
    private String estadoNascimento;

    public SelecaoParcial() {
        id = 0;
        altura = 0;
        peso = 0;
        anoNascimento = 0;
        nome = "";
        universidade = "";
        cidadeNascimento = "";
        estadoNascimento = "";
    }

    SelecaoParcial(int id, String nome, int altura, int peso, String universidade, int anoNascimento,
            String cidadeNascimento, String estadoNascimento) {
        this.setId(id);
        this.setNome(nome);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setAnoNascimento(anoNascimento);
        this.setUniversidade(universidade);
        this.setCidadeNacimento(cidadeNascimento);
        this.setEstadoNascimento(estadoNascimento);
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

    public void setCidadeNacimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    public void setEstadoNascimento(String estadoNascimento) {
        this.estadoNascimento = estadoNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public String getUniversidade() {
        return this.universidade;
    }

    public String getCidadeNacimento() {
        return this.cidadeNascimento;
    }

    public String getEstadoNascimento() {
        return this.estadoNascimento;
    }

    public int getId() {
        return this.id;
    }

    public int getAltura() {
        return this.altura;
    }

    public int getPeso() {
        return this.peso;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public static String[] lerDados() throws Exception {

        String[] entrada = new String[4000];
        int num = 0;

        RandomAccessFile arqJogador = new RandomAccessFile("C:\\Users\\João\\Documents\\Aeds2\\TP2\\players.csv", "rw");

        arqJogador.seek(60);

        do {
            entrada[num] = arqJogador.readLine();
        } while (entrada[num++] != null);
        num--;

        for (int i = 1; i < num; i++) {
            if (entrada[i].contains(",,")) {
                entrada[i] = entrada[i].replaceAll(",,", ",nao informado,");

            }
            int tam = entrada[i].length() - 1;

            if (entrada[i].charAt(tam) == ',') {
                entrada[i] += "nao informado";
            }
        }

        arqJogador.close();
        return entrada;

    }

    public void clone(SelecaoParcial S) {
        if (S != null) {
            this.setId(S.getId());
            this.setCidadeNacimento(S.getCidadeNacimento());
            this.setEstadoNascimento(S.getEstadoNascimento());
            this.setNome(S.getNome());
            this.setAltura(S.getAltura());
            this.setPeso(S.getPeso());
            this.setAnoNascimento(S.getAnoNascimento());
            this.setUniversidade(S.getUniversidade());
        }
    }

    public void salvarDados(int i, String[] saida) throws Exception {

        String[] identificador = saida[i].split(",");
        this.setId(Integer.parseInt(identificador[0]));
        this.setNome(identificador[1]);
        this.setAltura(Integer.parseInt(identificador[2]));
        this.setPeso(Integer.parseInt(identificador[3]));
        this.setUniversidade(identificador[4]);
        this.setAnoNascimento(Integer.parseInt(identificador[5]));
        this.setCidadeNacimento(identificador[6]);
        this.setEstadoNascimento(identificador[7]);

    }

    public void imprimir() {
        MyIO.println("[" + getId() + " ## " + getNome() + " ## " + getAltura() + " ## " + getPeso() + " ## "
                + getAnoNascimento()
                + " ## " + getUniversidade() + " ## " + getCidadeNacimento() + " ## " + getEstadoNascimento() + "]");
    }

    public static void swap(int i, int j) {
        SelecaoParcial temp = Jogadores[i];
        Jogadores[i] = Jogadores[j];
        Jogadores[j] = temp;
        mov += 3;
    }

    public static void selecaoParcial(SelecaoParcial[] jogadores, int n) {
        int aux = 0;

        for (int j = 0; j < n - 1; j++) {
            int menorIndice = j;

            for (int k = j + 1; k < n; k++) {
                aux = jogadores[k].getNome().compareTo(jogadores[menorIndice].getNome());

                if (aux < 0) {
                    menorIndice = k;
                }
            }

            if (menorIndice != j) {
                SelecaoParcial temp = jogadores[j];
                jogadores[j] = jogadores[menorIndice];
                jogadores[menorIndice] = temp;
            }
        }
    }

    public static void main(String[] args) throws Exception {

        Date novo = new Date();

        String[] comeco = new String[1000];
        int num = 0;

        comeco[num] = MyIO.readLine();

        while (!comparaString(comeco[num], "FIM")) {
            num++;
            comeco[num] = MyIO.readLine();
        }

        String[] saida = lerDados();

        Jogadores = new SelecaoParcial[num];

        for (int i = 0; i < num; i++) {
            Jogadores[i] = new SelecaoParcial();
            Jogadores[i].salvarDados(Integer.parseInt(comeco[i]), saida);
        }

        int aux = 0;

        for (int j = 0; j < num - 1; j++) {
            int menorIndice = j;
        
            for (int k = j + 1; k < num; k++) {
                aux = Jogadores[k].getNome().compareTo(Jogadores[menorIndice].getNome());
                comp++;
        
                if (aux < 0) {
                    menorIndice = k;
                }
            }
        
            if (menorIndice != j) {
                SelecaoParcial temp = Jogadores[j];
                Jogadores[j] = Jogadores[menorIndice];
                Jogadores[menorIndice] = temp;
            }
        }

        selecaoParcial(Jogadores, num);

        for (int i = 0; i < num; i++) {
            Jogadores[i].imprimir();
        }

        Date fim = new Date();

        long tempoExec = fim.getTime() - novo.getTime();

        log(comp, mov, tempoExec);
    }

    public static void log(int comp, int mov, long tempoExecucao) throws Exception {
        RandomAccessFile arquivoMatricula = new RandomAccessFile("matrícula_heapsort.txt", "rw");
        arquivoMatricula.writeBytes("802151\t" + comp + "\t" + mov + "\t" + tempoExecucao);
        arquivoMatricula.close();
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
