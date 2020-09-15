// Mountain and valley travel by a man (indicated by one step)
// U means uphill travel
// D means downhill travel
// man always start with sea level and end with end with sea level
// Problem statement is , How many valleythe man crossed from start to end.
// input
// 1. n (total no of step)
// 2. string no of steps denoted by string
// ref https://www.hackerrank.com/challenges/counting-valleys/problem
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int countingValleys(int n, char *steps);

void main()
{
    int n;
    scanf("%d\n", &n);
    // char charSteps[n];
    // fgets(charSteps, n * sizeof(char), stdin);
    char *steps = (char *)malloc(n * sizeof(char));
    fgets(steps, n * sizeof(char), stdin);
    int vallyCount = countingValleys(n, steps);
    printf("%d", vallyCount);
}
int countingValleys(int n, char *steps)
{
    int vallyCount = 0, stepBal = 0;
    for (int pos = 0; pos < n; pos++)
    {
        if (steps[pos] == 'D' && stepBal == 0)
        {
            vallyCount += 1;
        }
        if (steps[pos] == 'U')
        {
            stepBal += 1;
        }
        else if (steps[pos] == 'D')
        {
            stepBal -= 1;
        }
    }
    return vallyCount;
}