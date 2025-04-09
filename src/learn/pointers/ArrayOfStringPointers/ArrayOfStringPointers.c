#include <stdio.h>
#include <stdlib.h>

void fun(int *p)

{

    int q = 10;

    p = &q;
}

int main()
{

    char *s[] = {"knowledge", "is", "power"};
    char **p;
    p = s;
    printf("%s ", (*p)++);

    printf("%s ", (*p)++);
    printf("%s ", *p++);
    printf("%s ", *p++);
    getchar();
    return 0;
}