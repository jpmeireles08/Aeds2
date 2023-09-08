#include <stdio.h>
#include <string.h>
#include <stdbool.h>

void isPalindromo(char palavra[], int tamanho);

int main() {
    char palavra[100];
    
    /* Usei a estrutura while para chamar o método e rodar até que a palavra digitada seja "FIM" */
    while (true) {
        fgets(palavra, 100, stdin);
        palavra[strcspn(palavra, "\n")] = '\0'; /* Uso essa função para remover o caracter de nova linha e nao dar erro*/
        
        if (strcmp(palavra, "FIM") == 0) {
           break;
        }
        
        int tamanho = strlen(palavra);
        isPalindromo(palavra, tamanho);
    }
    
    return 0;
}

// Função para verificar se a string é ou nao um palindrmo //
void isPalindromo(char palavra[], int tamanho) {
    bool resp = true;

    for (int i = 0; i < tamanho; i++) {
        if (palavra[i] == palavra[tamanho - i -1]) {

        } else resp = false;
    }

    if (resp == true) {
        printf("SIM\n");
    } else printf("NAO\n");
}

