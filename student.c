#include<stdio.h>
#include<string.h>

struct student {
    int roll ;
    float cgpa;
    char name[100];


    };


    int main(){
        struct student ece[100];
        ece[0].roll = 1466;
        ece[0].cgpa = 10.0;
        strcpy(ece[0].name,"prince");
        
     ece[1].roll = 4566;
        ece[1].cgpa = 10.0;
        strcpy(ece[1].name,"neha");
        


        printf("student name  = %s \n", ece[0].name);
        printf("student roll  = %d\n", ece[0].roll);
        printf("student cgpa =  %f \n", ece[0].cgpa);



        
        printf("student name  = %s \n", ece[1].name);
        printf("student roll  = %d \n", ece[1].roll);
        printf("student cgpa  = %f \n", ece[1].cgpa);
         return 0;


    }
