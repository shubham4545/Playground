#include <iostream>
#include<stdio.h>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};

int main()
{
        struct student st;  
        gets(st.name);   
        cin>>st.roll;       
        cin>>st.marks;
  cout<<endl;
  cout<<"Student Details";
        cout<<"\nName: "<<st.name;
        cout<<"\nRoll: "<<st.roll;
        cout<<"\nMarks: "<<st.marks;
        return 0;

}