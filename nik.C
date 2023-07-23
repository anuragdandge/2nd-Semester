#include<stdio.h>
#define FUN(i)(i*i)
int main(){
    int x,y=3;
    x = FUN(y+2);
    printf("%d\n",x);
    return 0;
}