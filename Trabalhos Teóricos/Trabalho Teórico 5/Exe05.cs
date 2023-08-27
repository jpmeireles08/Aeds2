public class Fila {
    private Celula primeiro;
    public Fila() {
       primeiro = new Celula();
    }
    
    public void void Inserir(int x) {
       Celula i;
       for (i = primeiro; i.prox != null; i = i.prox);
       i.prox = new Celula(x);
       i = null;
    }
    
    public int Remover(){
       if (primeiro == ultimo) throw new Exception("Erro ao remover!");
       Celula tmp = primeiro;
       primeiro = primeiro.prox;
       int resp = primeiro.elemento;
       tmp.prox = null;
       tmp = null;
       return resp;
    }  
}