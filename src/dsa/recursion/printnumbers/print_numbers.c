#include <stdio.h>
void reversePrint(int num);
void print(int num)
{
    if (num == 0)
    {
        return;
    }
    print(num - 1);
    printf("%d ", num);
}

int main()
{
    printf("Enter number of elements: ");
    int num;
    scanf("%d", &num);
    reversePrint(num);
    printf("\n");
    print(num);
    return 0;
}

void reversePrint(int num)
{
    if (num == 0)
        return;
    printf("%d ", num);
    reversePrint(num - 1);
}