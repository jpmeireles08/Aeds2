#include <stdio.h>
#include <string.h>
#include <stdio.h>

int main () {
    char x[100];
while(scanf("%s", x) != EOF)
{
    char y[100];
    scanf("%s", y);
    char temp;



    if (strlen(x) > strlen(y)) {
        for (int i = 0; i < strlen(x); i++) {
            if (i < strlen(y)) {

                printf("%c", x[i]);
                printf("%c", y[i]);
            } else {
                printf("%c", x[i]);

            }
        }
    } else {
        for (int i = 0; i < strlen(y); i++) {
            if (i < strlen(x)) {
                printf("%c", x[i]);
                printf("%c", y[i]);
            } else {
                printf("%c", y[i]);
            }
        }
    }
    printf("\n");
}
    return 0;
}