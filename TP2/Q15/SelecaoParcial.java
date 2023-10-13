package Aeds2.TP2.Q15;

import java.io.*;

//Selecao parcial Q15

public class SelecaoParcial{

    public static int numComparacoes = 0, numTrocas= 0;

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

    public SelecaoParcial(int id, String nome, int altura, int peso, String universidade, int anoNascimento , String cidadeNascimento, String estadoNascimento){
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
        if(altura > 1)
            this.altura = altura;
    }

    public void setPeso(int peso){
        if(peso > 0)
            this.peso = peso;
    }

    public void setAnoNascimento(int anoNascimento){
        if(anoNascimento > 1900)
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

    

    public SelecaoParcial clone (SelecaoParcial J){
        SelecaoParcial clone = new SelecaoParcial();
        clone.setAltura(getAltura());
        clone.setPeso(getPeso());
        clone.setAnoNascimento(getAnoNascimento());
        return clone;
    }

    

    public static String[] lerDados() throws Exception{
    
        String[] entrada = new String[4000];
        int n = 0;
        
  
        RandomAccessFile leitor = new RandomAccessFile("C:\\Users\\meire\\Repositório Local\\Aeds2\\TP2\\players.csv", "rw");
        
        leitor.seek(60);

        do {
            entrada[n] = leitor.readLine();
        } while (entrada[n++] != null);

        n--;

        for(int i = 1; i < n; i++){
            if(entrada[i].contains(",,")){
                entrada[i] = entrada[i].replaceAll(",,", ",nao informado,");
                
            }
            int tam = entrada[i].length()-1;
            if(entrada[i].charAt(tam) == ','){
                entrada[i] += "nao informado";   
            }
        }

        leitor.close();
        return entrada;
    }

    public void salvarDados(int id, String[] dadosArquivo) throws Exception{
        
        String[] salvar = dadosArquivo[id].split(",");
        this.setId(Integer.parseInt(salvar[0]));
        this.setNome(salvar[1]);
        this.setAltura(Integer.parseInt(salvar[2]));
        this.setPeso(Integer.parseInt(salvar[3]));
        this.setUniversidade(salvar[4]);
        this.setAnoNascimento(Integer.parseInt(salvar[5]));
        this.setCidadeNacimento(salvar[6]);
        this.setEstadoNascimento(salvar[7]);
        
    }

    public void imprimir(){
        MyIO.println("[" + getId() + " ## " + getNome() + " ## " + getAltura() + " ## " + getPeso() + " ## " +  getAnoNascimento()
        + " ## " + getUniversidade()+ " ## " + getCidadeNacimento() + " ## " + getEstadoNascimento() + "]");
    }

    public static void swap(int i, int j) {
        SelecaoParcial temp = Jogadores[i];
        Jogadores[i] = Jogadores[j];
        Jogadores[j] = temp;
        numTrocas += 3;
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

        
    public static void main(String[] args) throws Exception{
        
        String[] entrada = new String[1000];
        int n = 0;
        entrada[n] = MyIO.readLine();
       
        while(entrada[n].equals("FIM") == false){
            n++;
            entrada[n] = MyIO.readLine();
        }

        String[] dadosArquivo = lerDados();

        Jogadores = new SelecaoParcial[n];

        for(int i = 0; i < n; i++){
            Jogadores[i] = new SelecaoParcial();
            Jogadores[i].salvarDados(Integer.parseInt(entrada[i]), dadosArquivo);
        }

        int aux = 0;

        for (int j = 0; j < n - 1; j++) {
            int menorIndice = j;
        
            for (int k = j + 1; k < n; k++) {
                aux = Jogadores[k].getNome().compareTo(Jogadores[menorIndice].getNome());
                numComparacoes++;
        
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



        selecaoParcial(Jogadores, n);

        for(int i = 0; i < 10; i++)
            Jogadores[i].imprimir();

        
        
        
    }

}