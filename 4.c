#include<stdio.h>
int main()
{
float marks[5], total=0,avg;
printf("enter 5 subject marks:\n");
for (int i = 0; i < 5; i++)
{
    scanf("%f",&marks[i]);
    total=total+marks[i];
    
}
avg=total/5;
if (avg>=90)
{
    printf("Grade: Ex");
}
else if (avg>=80)
{
    printf("Grade: A");
}else if (avg>=70)
{
    printf("Grade: B");
}else if (avg>=60)
{
    printf("Grade: C");
}else 
{
    printf("Grade: F");
}

}