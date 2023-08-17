#include <stdio.h>

int main() {
    int n, num;
    
    // Pedir ao usuário para inserir o número de valores
    printf("Digite o número de valores a serem inseridos: ");
    scanf("%d", &n);
    
    // Abrir o arquivo para escrita
    FILE *arquivo = fopen("numeros.txt", "w");
    if (arquivo == NULL) {
        printf("Erro ao abrir o arquivo!\n");
        return 1;
    }
    
    // Pedir ao usuário para inserir n números e escrevê-los no arquivo
    for (int i = 0; i < n; i++) {
        printf("Digite o valor %d: ", i + 1);
        scanf("%d", &num);
        fprintf(arquivo, "%d\n", num);
    }
    
    // Fechar o arquivo
    fclose(arquivo);
    
    // Abrir o arquivo novamente para leitura
    arquivo = fopen("numeros.txt", "r");
    if (arquivo == NULL) {
        printf("Erro ao abrir o arquivo!\n");
        return 1;
    }
    
    // Ler os números do arquivo e exibi-los na tela
    printf("\nNúmeros armazenados no arquivo:\n");
    while (fscanf(arquivo, "%d", &num) != EOF) {
        printf("%d\n", num);
    }
    
    // Fechar o arquivo
    fclose(arquivo);
    
    return 0;
}
