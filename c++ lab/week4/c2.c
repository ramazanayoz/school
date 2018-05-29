#include<stdio.h>

typedef struct Person1{
        int age;
        char name[8];
        double height;
 } Person1;
typedef union Person2{
        int age;
        char name[8];
        double height;
 } Person2;

int main(){
printf("%d\n",sizeof(Person1));
printf("%d\n",sizeof(Person2));
return 0;
}
