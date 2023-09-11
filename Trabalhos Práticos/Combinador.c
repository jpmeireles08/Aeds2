#include <stdio.h>
#include <stdbool.h>
#include <string.h>

int main () {
    char palavra1[100];
    scanf("%s", &palavra1);

    char palavra2[100];
    scanf("%s", &palavra2);

    int x = strlen(palavra1);
    int y = strlen(palavra2);

    if (x > y) {
        for (int i = 0; i < x; i++) {
            if (i < y) {
            printf("%c", palavra1[i]);
            printf("%c", palavra2[i]);
            } else 
            printf("%c", palavra1[i]);
        }
    } else {
        for (int i = 0; i < y; i++) {
            if (i < x) {
                printf("%c", palavra1[i]);
                printf("%c", palavra2[i]);
            } else {
                printf("%c", palavra2[i]);
            }
        }
    }

    return 0;
}