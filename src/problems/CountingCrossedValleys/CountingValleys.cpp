// Mountain and valley travel by a man (indicated by one step)
// U means uphill travel
// D means downhill travel
// man always start with sea level and end with end with sea level
// Problem statement is , How many valleythe man crossed from start to end.
// input
// 1. n (total no of step)
// 2. string no of steps denoted by string
// ref https://www.hackerrank.com/challenges/counting-valleys/problem
#include <iostream>
#include <string>
using namespace std;
int countingValleys(int n, char *steps);

int main()
{
    int n;
    cin >> n;
    cin.ignore(1, '\n');
    char *steps = (char *)malloc(n * sizeof(char));
    cin.getline(steps, n);
    int vallyCount = countingValleys(n, steps);
    cout << vallyCount;
    return 0;
}

int countingValleys(int n, char *steps)
{
    int valleyCount = 0, stepBal = 0;
    for (int pos = 0; pos < n; pos++)
    {
        if (stepBal == 0 && steps[pos] == 'D')
        {
            valleyCount++;
        }
        if (steps[pos] == 'U')
        {
            stepBal++;
        }
        else if (steps[pos] == 'D')
        {
            stepBal--;
        }
    }
    return valleyCount;
}
