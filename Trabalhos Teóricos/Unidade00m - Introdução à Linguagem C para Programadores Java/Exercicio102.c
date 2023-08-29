<<<<<<< HEAD
#include <stdio.h>

void imprimirOrdemInversa() {
    int num;
    
    scanf("%d", &num);
    
    if (num < 0) {
        return;
    }

    imprimirOrdemInversa();
    
    if (num >= 0) {
        printf("%d ", num);
    }
}

int main() {
    printf("Insira uma sequencia de numeros (termine com um numero negativo):\n");
    
    imprimirOrdemInversa();
    
    printf("\n");
    
    return 0;
}
=======
#include <stdio.h>

void imprimirOrdemInversa() {
    int num;
    
    scanf("%d", &num);
    
    if (num < 0) {
        return;
    }

    imprimirOrdemInversa();
    
    if (num >= 0) {
        printf("%d ", num);
    }
}

int main() {
    printf("Insira uma sequencia de numeros (termine com um numero negativo):\n");
    
    imprimirOrdemInversa();
    
    printf("\n");
    
    return 0;
}
>>>>>>> 8fbfee88ffe680bc490397f48a351d795f5db157
