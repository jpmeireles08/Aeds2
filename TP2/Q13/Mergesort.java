import java.util.Date;
import java.io.*; 

    class Mergesort{

    public static int mov = 0, comp = 0;
    public static Mergesort[] Jogadores;
    

    private int id;
    private int altura;
    private int peso;
    private int anoNascimento;
    private String nome;
    private String universidade;
    private String cidadeNascimento;
    private String estadoNascimento;

    
    public Mergesort() {
        id = 0;
        altura = 0;
        peso = 0;
        anoNascimento = 0;
        nome = "";
        universidade = "";
        cidadeNascimento = "";
        estadoNascimento = "";
    }


    Mergesort(int id, String nome, int altura, int peso, String universidade, int anoNascimento , String cidadeNascimento, String estadoNascimento){
        this.setId(id);
        this.setNome(nome);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setAnoNascimento(anoNascimento);
        this.setUniversidade(universidade);
        this.setCidadeNacimento(cidadeNascimento);
        this.setEstadoNascimento(estadoNascimento);
    }
    
    public void setId(int id){
        this.id = id;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setUniversidade(String universidade){
        this.universidade = universidade;
    }

    public void setCidadeNacimento(String cidadeNascimento){
        this.cidadeNascimento = cidadeNascimento;
    }

    public void setEstadoNascimento(String estadoNascimento){
        this.estadoNascimento = estadoNascimento;
    }
    
    public String getNome(){
        return this.nome;
    }

    public String getUniversidade(){
        return this.universidade;
    }

    public String getCidadeNacimento(){
        return this.cidadeNascimento;
    }

    public String getEstadoNascimento(){
        return this.estadoNascimento;
    }

    public int getId(){
        return this.id;
    }

    public int getAltura(){
        return this.altura;
    }

    public int getPeso(){
        return this.peso;
    }

    public int getAnoNascimento(){
        return this.anoNascimento;
    }

    
    public static String[] lerDados() throws Exception{
    

        String[] entrada = new String[4000];
        int num = 0;

        RandomAccessFile arqJogador = new RandomAccessFile("/tmp/players.csv", "rw");
        
        arqJogador.seek(60);
        
        do {
            entrada[num] = arqJogador.readLine();
        } while (entrada[num++] != null);
        num --;

        for(int i = 1; i < num; i++){
            if(entrada[i].contains(",,")){
                entrada[i] = entrada[i].replaceAll(",,", ",nao informado,");
                
            }
            int tam = entrada[i].length()-1;
            
            if(entrada[i].charAt(tam) == ','){
                entrada[i] += "nao informado";   
            }
        }

        arqJogador.close();
        return entrada;
        
    }

    public void clone(Mergesort M) {
        if (M != null) {
            this.setId(M.getId());
            this.setCidadeNacimento(M.getCidadeNacimento());
            this.setEstadoNascimento(M.getEstadoNascimento());
            this.setNome(M.getNome());
            this.setAltura(M.getAltura());
            this.setPeso(M.getPeso());
            this.setAnoNascimento(M.getAnoNascimento());
            this.setUniversidade(M.getUniversidade());
        }
    }

    public void salvarDados(int i, String[] saida) throws Exception{
        
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
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(getId()).append(" ## ").append(getNome()).append(" ## ").append(getAltura()).append(" ## ")
          .append(getPeso()).append(" ## ").append(getAnoNascimento()).append(" ## ").append(getUniversidade()).append(" ## ")
          .append(getCidadeNacimento()).append(" ## ").append(getEstadoNascimento()).append("]");
        MyIO.println(sb.toString());
    }

    public static void swap(int i, int j) {
        Mergesort temp = Jogadores[i];
        Jogadores[i] = Jogadores[j];
        Jogadores[j] = temp;
        mov += 3;
     }

    public static void mergesort(int esq, int dir) {
        if (esq < dir - 1) {
            int meio = (esq + dir) / 2;
            mergesort(esq, meio);
            mergesort(meio, dir);
            intercalar(esq, meio, dir);
        }
    }

    public static void intercalar(int esq, int meio, int dir) {
        Mergesort novoVetor[] = new Mergesort[dir - esq];
        int i = esq, m = meio, pos = 0;

        while (i < meio && m < dir) {

            if (Jogadores[i].getUniversidade().compareTo(Jogadores[m].getUniversidade()) < 0 || (Jogadores[i].getUniversidade().compareTo(Jogadores[m].getUniversidade()) == 0) && Jogadores[i].getNome().compareTo(Jogadores[m].getNome()) <= 0) {
                novoVetor[pos] = Jogadores[i];
                mov++;
                pos = pos + 1;
                i = i + 1;

            } else {
                novoVetor[pos] = Jogadores[m];
                mov++;
                pos = pos + 1;
                m = m + 1;
            }
           
            comp+=3;
        }

        while (i < meio) {
            novoVetor[pos] = Jogadores[i];
            mov++;
            pos = pos + 1;
            i = i + 1;
        }

        while (m < dir) {
            novoVetor[pos] = Jogadores[m];
            mov++;
            pos = pos + 1;
            m = m + 1;
        }

        for (pos = 0, i = esq; i < dir; i++, pos++) {
            Jogadores[i] = novoVetor[pos];
            mov++;
        }
    }
    
    
    public static void main(String[] args) throws Exception{
    
        Date novo = new Date();
        
        String[] comeco = new String[1000];
        int num = 0;       
        
        comeco[num] = MyIO.readLine();
        
        while(comeco[num].equals("FIM") == false){
            num++;
            comeco[num] = MyIO.readLine();
        }
        
        String[] saida = lerDados();
    
        Jogadores = new Mergesort[num];
    
        for(int i = 0; i < num; i++) { 
            Jogadores[i] = new Mergesort();
            Jogadores[i].salvarDados(Integer.parseInt(comeco[i]), saida); 
        }
    
        mergesort(0, num);
    
        for (int i = 0; i < num; i++) {
            Jogadores[i].imprimir();
        }
    
        Date fim = new Date();
    
        long tempoExec = fim.getTime() - novo.getTime();
    
        log(comp, mov, tempoExec);
    }
    
    

    public static void log(int comp, int mov, long tempoExecucao) throws Exception {
        RandomAccessFile arquivoMatricula = new RandomAccessFile("matrícula_mergesort.txt", "rw");
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

