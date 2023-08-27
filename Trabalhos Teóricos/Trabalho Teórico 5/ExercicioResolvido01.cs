class Lista {
    int[] array;
    int n;
    Lista () {
        array = new int[6];
        n = 0;
    }
    
    Lista (int tamanho){
        array = new int[tamanho];
        n = 0;
    }
 
    void InserirInicio(int x) { ... }
    void InserirFim(int x) { ... }
    void Inserir(int x, int pos) { ... }
    int RemoverInicio() { ... }
    int RemoverFim() { ... }
    int Remover(int pos) { ... }
    void Mostrar() { ... }
}

    void InserirInicio(int x) {
    
        if (n >= array.Length)
        Environment.Exit(0);
 
        for (int i = n; i > 0; i--) {
        array[i] = array[i-1];
        }
        
        array[0] = x;
        n++;
    }

    void InserirFim(int x) {
        
        if (n >= array.Length)
        Environment.Exit(0);
        array[n] = x;
        n++;
    }

    void Inserir(int x, int pos) {
        
        if (n >= array.Length || pos < 0 || pos > n)
            Environment.Exit(0);
 
        for (int i = n; i > pos; i--){
        array[i] = array[i-1];
        }
    
        array[pos] = x;
        n++;
    }

    int RemoverInicio() {
        
        if (n == 0)
        Environment.Exit(0);
        
        int resp = array[0];
        n--;
        
        for (int i = 0; i < n; i++) {
            array[i] = array[i+1];
        }
        
        return resp;
    }

    int RemoverFim() {
        
        if (n == 0)
        Environment.Exit(0);

        return array[--n];
    } 

    int Remover(int pos) {
 
        if (n == 0 || pos < 0 || pos >= n)
            Environment.Exit(0);
        
        int resp = array[pos];
        n--;
 
        for (int i = pos; i < n; i++){
        array[i] = array[i+1];
        }
 
    return resp;
    }

    void Mostrar() {
        
        Console.Write("[ ");
        
        for (int i = 0; i < n; i++) {
            Console.Write(array[i] + " ");
        }
        
        Console.WriteLine(" ]");
    }

    







