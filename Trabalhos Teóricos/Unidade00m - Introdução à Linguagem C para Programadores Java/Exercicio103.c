<<<<<<< HEAD
#include <stdio.h>

int main() {
    int n, num, soma;

    printf("Digite a quantidade de numeros: ");
    scanf("%d", &n);

    printf("Digite os numeros:\n");

    int i = 0;
    int j = n - 1;

    for (int k = 0; k < n / 2; k++) {
        scanf("%d", &num);
        scanf("%d", &soma);

        printf("Soma do %do e %do numero: %d\n", i + 1, j + 1, num + soma);

        i++;
        j--;
    }

    if (n % 2 != 0) {
        scanf("%d", &num);
        printf("Numero do meio: %d\n", num);
    }

    return 0;
}
=======
#include <stdio.h>

int main() {
    int n, num, soma;

    printf("Digite a quantidade de numeros: ");
    scanf("%d", &n);

    printf("Digite os numeros:\n");

    int i = 0;
    int j = n - 1;

    for (int k = 0; k < n / 2; k++) {
        scanf("%d", &num);
        scanf("%d", &soma);

        printf("Soma do %do e %do numero: %d\n", i + 1, j + 1, num + soma);

        i++;
        j--;
    }

    if (n % 2 != 0) {
        scanf("%d", &num);
        printf("Numero do meio: %d\n", num);
    }

    return 0;
}
>>>>>>> 8fbfee88ffe680bc490397f48a351d795f5db157
