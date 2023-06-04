#include <iostream>
using namespace std;
int main()
{
    //    char processes[5]={'T','F','T','T','F'};
    char flag[2] = {'T', 'F'};
    int progress = 0;
    int n = 2;
    int count = 0;
    // for (int i = 0; i < n; i++)
    // {
    while (1)
    {
        flag[0] = 'T';
        int turn = 1;
        while (turn == 1 && flag[1] == 'T')
        {
            cout << "P0 got CS\n";
            break;
        }
        flag[0] = 'F';

        // flag[0] = 'T';
        // int turn = 1;
        // while (turn == 1 && flag[1] == 'T')
        // {
        //     cout << "P0 got CS\n";
        //     break;
        // }
        // flag[0] = 'F';
    }
    // }
}