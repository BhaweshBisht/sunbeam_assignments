#include<stdio.h>
int main()
{

    int n, a=0,b=1,c;
    printf("enter a no:");
    scanf("%d",n);
    printf("fibonacci series:%d,%d",a,b);
    for (int i = 2; i <n; i++)
    {
      c=a+b;
      printf("%d",c);
      a=b;
      b=c;
    }
    return 0;
}