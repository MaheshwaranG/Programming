#include <stdio.h>
#include <string.h>

void main()
{
    char user[50];
    printf("Enter your name : ");
    fgets(user, sizeof(user), stdin);
    // scanf("%s", user);    // scanf function read string until reaches space. use fgets function
    printf("Hello world by %s", user);
}
