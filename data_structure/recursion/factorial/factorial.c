#include <stdio.h>
int factorial(int number);
int sum(int number);
int main()
{
    int num;
    printf("Enter number to find factorial : ");
    scanf("%d", &num);
    printf("Factorial of %d is : %d\n", num, factorial(num));
    printf("Sum of %d is : %d\n", num, sum(num));
    return 0;
}

int factorial(int number)
{
    if (number == 0)
    {
        return 1;
    }
    return number * factorial(number - 1);
}

int sum(int number)
{
    if (number == 1)
    {
        return 1;
    }
    return number + sum(number - 1);
}