import java.util.Date;
import java.io.*;

public class CountingSort {

    public static int mov = 0, comp = 0;
    public static CountingSort[] Jogadores;

    private int id;
    private int altura;
    private int peso;
    private int anoNascimento;
    private String nome;
    private String universidade;
    private String cidadeNascimento;
    private String estadoNascimento;

    public CountingSort() {
        id = 0;
        altura = 0;
        peso = 0;
        anoNascimento = 0;
        nome = "";
        universidade = "";
        cidadeNascimento = "";
        estadoNascimento = "";
    }

    public CountingSort(int id, String nome, int altura, int peso, String universidade, int anoNascimento,
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
        if (altura > 1)
            this.altura = altura;
    }

    public void setPeso(int peso) {
        if (peso > 0)
            this.peso = peso;
    }

    public void setAnoNascimento(int anoNascimento) {
        if (anoNascimento > 1900)
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

        RandomAccessFile arqJogador = new RandomAccessFile("/tmp/players.csv", "r");

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

    public void clone(CountingSort C) {

        this.setId(C.getId());
        this.setCidadeNacimento(C.getCidadeNacimento());
        this.setEstadoNascimento(C.getEstadoNascimento());
        this.setNome(C.getNome());
        this.setAltura(C.getAltura());
        this.setPeso(C.getPeso());
        this.setAnoNascimento(C.getAnoNascimento());
        this.setUniversidade(C.getUniversidade());

    }

    public void salvarDados(int index, String[] saida) throws Exception {

        String[] identificador = saida[index].split(",");
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

    public static void countingsort(int n) {
        int[] count = new int[maior(n) + 1];
        int tamanho = count.length;
        CountingSort[] ordenar = new CountingSort[n];

        for (int i = 0; i < tamanho; count[i] = 0, i++)
            ;

        for (int i = 0; i < n; i++) {
            count[Jogadores[i].getAltura()]++;
        }

        for (int i = 1; i < tamanho; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            ordenar[count[Jogadores[i].getAltura()] - 1] = new CountingSort();
            ordenar[count[Jogadores[i].getAltura()] - 1].clone(Jogadores[i]);
            count[Jogadores[i].getAltura()]--;
        }

        for (int i = 1; i < n; i++) {
            CountingSort tmp = new CountingSort();
            tmp.clone(ordenar[i]);
            int j = i - 1;

            while (((j >= 0) && ordenar[j].getAltura() == tmp.getAltura()
                    && (ordenar[j].getNome().compareTo(tmp.getNome())) > 0)) {
                comp += 3;
                mov++;
                ordenar[j + 1].clone(ordenar[j]);
                j--;
            }
            ordenar[j + 1].clone(tmp);
            mov++;
        }

        for (int i = 0; i < n; i++) {
            Jogadores[i].clone(ordenar[i]);
        }
    }

    public static int maior(int n) {
        CountingSort maior = new CountingSort();
        maior.clone(Jogadores[0]);

        for (int i = 0; i < n; i++) {
            comp++;
            if (maior.getAltura() < Jogadores[i].getAltura()) {
                maior.clone(Jogadores[i]);
                mov++;
            }
        }
        return maior.getAltura();
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

        Jogadores = new CountingSort[num];

        for (int i = 0; i < num; i++) {
            Jogadores[i] = new CountingSort();
            Jogadores[i].salvarDados(Integer.parseInt(comeco[i]), saida);
        }

        countingsort(num);
        for (int i = 0; i < num; i++)
            Jogadores[i].imprimir();

        Date fim = new Date();

        long tempoExec = fim.getTime() - novo.getTime();

        log(comp, mov, tempoExec);
    }

    public static void log(int comp, int mov, long tempoExecucao) throws Exception {
        RandomAccessFile arquivoMatricula = new RandomAccessFile("matrícula_countingsort.txt", "rw");
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

