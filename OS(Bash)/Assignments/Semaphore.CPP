#include <iostream>
using namespace std;
int E = 10, F = 00, S = 1;
int produced = 0;
int arr[10];
int Produce()
{
    produced++;
    cout << " Produced " << produced;
}
void wait()
{
    while (S <= 0)
        ;
    S = S - 1;
}
void Producer()
{
    while (true)
    {
        Produce();
        wait(E);
        wait(S);
        // wait()
        arr.append();
        signal(S);
        signal(F);
    }
}
int main()
{

}