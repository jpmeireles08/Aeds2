void inverter () {
	
    Celula fim = ultimo;
	
    while (primeiro != fim) {
	    Celula nova = new Celula (primeiro.prox.elemento);
		nova.prox = fim.prox;
		fim.prox = nova;
		Celula tmp = primeiro.prox;
		primeiro.prox = tmp.prox;
		nova = tmp = tmp.prox = null;
		
        if (ultimo == fim) {
            ultimo = ultimo.prox;
        }  
	}  
	
    fim = null;
}