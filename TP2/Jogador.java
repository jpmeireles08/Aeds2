public class Jogador {

    private int id;
    private String nome;
    private int altura;
    private int peso;
    private String universidade;
    private int anoNascimento;
    private String cidadeNascimento;
    private String estadoNascimento;

    public Jogador() {
        id = 0;
        altura = 0;
        peso = 0;
        anoNascimento = 0;
        nome = "";
        universidade = "";
        cidadeNascimento = "";
        estadoNascimento = "";
    }

    public Jogador (int id, int altura, int peso, int anoNascimento, String nome, String universidade, 
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

    public void setId (int id) {
        this.id = id;
    }

    public void setAltura (int altura) {
        this.altura = altura;
    }

    public void setPeso (int peso) {
        this.peso = peso;
    }

    public void setAnoNascimento (int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setUniversidade (String universidade) {
        this.universidade = universidade;
    }

    public void setCidadeNascimento (String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    public void setEstadoNascimento (String estadoNascimento) {
        this.estadoNascimento = estadoNascimento;
    }

    public int getId () {
        return id;
    }

    public int getAltura () {
        return altura;
    }

    public int getPeso () {
        return peso;
    }

    public int getAnoNascimento () {
        return anoNascimento;
    }

    public String getNome () {
        return nome;
    }

    public String getUniversidade () {
        return universidade;
    }

    public String getCidadeNascimento () {
        return cidadeNascimento;
    }

    public String getEstadoNascimento () {
        return estadoNascimento;
    }

    public void imprimirDados () {
        System.out.println("[" + getId() + " ## " + getNome() + " ## " + getAltura() + " ## " + getPeso() 
        + " ## " + getAnoNascimento() + " ## " + getUniversidade() + " ## " + getCidadeNascimento() + " ## " +
        getEstadoNascimento() + "]");
    }

    public Jogador clone () {
        Jogador clone = new Jogador(id, altura, peso, anoNascimento, nome, universidade, cidadeNascimento, estadoNascimento);
        return clone;
    }

    public void lerDados () {

    }

    public static void main(String[] args) {

        String palavra = "";

        while (!comparaString(palavra, "FIM")) {
            palavra = MyIO.readLine();
        }
    }

    public static boolean comparaString (String palavra1, String palavra2) {
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