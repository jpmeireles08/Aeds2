struct celula {
    int elemento;
    struct celula *prox;
};

typedef struct Celula {
int elemento;
struct Celula *prox;
 } Celula;
 Celula *novaCelula(int elemento) {
Celula *nova = (Celula*) malloc(sizeof(Celula));
nova->elemento = elemento;
nova->prox = NULL;
return nova;
 }
