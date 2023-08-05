#include <stdio.h>
int main() {
int a;
scanf("%d", &a);
if (a % 2 == 0) {
printf("Par");
}
else if (a % 2 != 0) {
printf("Impar");
}
return 0;
}