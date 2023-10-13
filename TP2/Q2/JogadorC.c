#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Atleta {
    int id;
    char nome[100];
    int altura;
    int peso;
    char universidade[100];
    int anoNascimento;
    char cidadeNascimento[100];
    char estadoNascimento[100];
};

typedef struct Atleta Atleta;

void inicializarAtleta(Atleta *atleta) {
    atleta->id = 0;
    atleta->altura = 0;
    atleta->peso = 0;
    atleta->anoNascimento = 0;
    strcpy(atleta->nome, "");
    strcpy(atleta->universidade, "");
    strcpy(atleta->cidadeNascimento, "");
    strcpy(atleta->estadoNascimento, "");
}

char* verificar (char palavra[]);

void imprimirDados(Atleta atleta) {
    printf("[%d ## %s ## %d ## %d ## %d ## %s ## %s ## %s]\n",
           atleta.id, atleta.nome, atleta.altura, atleta.peso, atleta.anoNascimento,
           atleta.universidade, atleta.cidadeNascimento, atleta.estadoNascimento);
}

Atleta clone(Atleta atleta) {
    Atleta clone;
    clone.id = atleta.id;
    clone.altura = atleta.altura;
    clone.peso = atleta.peso;
    clone.anoNascimento = atleta.anoNascimento;
    strcpy(clone.nome, atleta.nome);
    strcpy(clone.universidade, atleta.universidade);
    strcpy(clone.cidadeNascimento, atleta.cidadeNascimento);
    strcpy(clone.estadoNascimento, atleta.estadoNascimento);
    return clone;
}

void lerDados(Atleta *atleta) {
    FILE *arqJogador = fopen("/tmp/players.csv", "r");
    

    if (arqJogador == NULL) {
        printf("Erro ao abrir o arquivo.\n");
        exit(1);
    }

    fseek(arqJogador, 60, SEEK_SET);
    for(int i = 0; i < 3922; i++){
    char *linha;
    linha = (char*) malloc(sizeof(char) * 500);
    fgets(linha, 500, arqJogador);

            char* token =  strsep(&linha, ",");
            atleta[i].id = atoi(token);
            token = strsep(&linha, ",");
            strcpy(atleta[i].nome, token);
            token = strsep(&linha, ",");

            atleta[i].altura = atoi(token);
            token = strsep(&linha, ",");
            atleta[i].peso = atoi(token);
            token = strsep(&linha, ",");
            strcpy(atleta[i].universidade, verificar(token));
            token = strsep(&linha, ",");
            atleta[i].anoNascimento = atoi(token);
            token = strsep(&linha, ",");
            strcpy(atleta[i].cidadeNascimento, verificar(token));
            token = strsep(&linha, "\n");
            strcpy(atleta[i].estadoNascimento, verificar(token));
    }

    fclose(arqJogador);
    
}

char* verificar (char palavra[]) {
    if (!palavra || strcmp(palavra, "\0") == 0) {
        return "nao informado";
    }
    return palavra;
}

int comparaString(const char *palavra1, const char *palavra2) {
    if(strcmp(palavra1, palavra2) == 0)
    return 1;
    else
    return 0;
}

int main() {
    Atleta jogadores[3922];
    char id[100];
    lerDados(jogadores);
    scanf("%s", id);

    while (!comparaString(id, "FIM")) {
        //inicializarAtleta(&jogadores[i]);
        // Remover o caractere de nova linha
       int position = atoi(id);
        imprimirDados(jogadores[position]);
        scanf("%s", id); 
        
    }

    return 0;
}