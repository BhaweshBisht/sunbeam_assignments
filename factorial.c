#include<stdio.h>
int main()
{
    int f=1,n;
    printf("enter a no: ");
    scanf("%d",n);
    for (int i = 1; i <n; i++)
    {
        f=f*i;
    }
    printf("Factorial of no is%d is %d",f);
}
