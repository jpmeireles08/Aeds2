int maior() {
 	
    int maior = - 1;
	
    if (primeiro == ultimo) {
		throw new Exception("Erro");
	} else {
		maior = primeiro.prox.elemento;
		Celula i = primeiro.prox.prox;
		
        while (i != null) {
			if (i.elemento > maior) {
				maior = i.elemento;
			}
				i = i.prox;
		}	}
			
            return maior;
}