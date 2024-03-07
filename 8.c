#include<stdio.h>
typedef struct 
{
    char name[30];
    int rno,mark;
}Student;
void StudentData(Student s)
{
    printf("Name:%s\n",s.name);
    printf("Rollno:%d\n",s.rno);
    printf("Marks:%d\n",s.mark);
}
int main()
{
    Student s1;
    printf("Enter Student Name:n");
     scanf("%s",s1.name);
    printf("Enter Student Rollno:\n");
     scanff("%d",s1.rno);
    printf("Enter Student Marks\n");
     scanf("%d",s1.mark);
 StudentData(s1);
 return 0;
}