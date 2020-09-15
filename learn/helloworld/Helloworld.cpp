#include <iostream>
#include <string>
using namespace std;

int main()
{
    // char user[50];
    string user;
    cout << "Enter your name : ";
    // std::cin >> user;
    getline(cin, user);
    std::cout << "Hello world by" << user << endl;
    return 0;
}