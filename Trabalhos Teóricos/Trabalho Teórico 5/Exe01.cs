int somar() {
 	
    int resp = 0;
 	
    for (Celula i = topo; i != null; i = i.prox) {
		resp += i.elemento;
	}
	
    return resp;
}