#include <stdio.h>
#include <string.h>
#include <stdio.h>

int main()
{
    int n = 0;
    scanf("%d", &n);
    char pokemon[n][100];
    int cont = 1;
    int total = 151;

    if (n >= 1 && n <= 1000)
    {
        for (int i = 0; i < n; i++)
        {
            scanf("%s", pokemon[i]);
        }

        for (int i = 0; i < n - 1; i++)
        {
            int diferente = 1;
            for (int j = 0; j < i; j++)
            {
                if (strcmp(pokemon[i], pokemon[j]) == 0) 
                {
                    diferente = 0;
                    break;
                }
            }

            if (diferente) {
                cont++;
            }
        }
    }
    printf("%d", cont);
    total = total - cont;
    printf("total %d", total);
}
