#include<iostream>
using namespace std;
struct emp{
char name[20];
  int id;
  int age;
  char designation[20];
  int salary;
  }e;
int main()
{
cout<<"Enter name:"<<endl<<"Enter ID:"<<endl<<"Enter age:"<<endl<<"Enter designation:"<<endl<<"Enter Salary:"<<endl;
cin>>e.name>>e.id>>e.age>>e.designation>>e.salary;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<e.name<<endl;
  cout<<"ID of the Employee : "<<e.id<<endl;
  cout<<"Age of the Employee : "<<e.age<<endl;
cout<<"Designation of the Employee : "<<e.designation<<endl;
  cout<<"Salary of the Employee : "<<e.salary<<endl;
}