#include<iostream>
#include<stdio.h>
using namespace std;
struct Co     { 
                char name[30];
                char city[20];
                int establishmentYear;
                float pp; 
               }c[100];
int main()
{
 int n,i;
 cin>>n;
 cout<<"Enter the number of colleges"<<endl;
  { for(i=1;i<=n;i++)
 {
  cin>>c[i].name>>c[i].city>>c[i].establishmentYear>>c[i].pp;
 }
 for(i=1;i<=n;i++)
 {
 
 cout<<"Enter the details of college "<<i<<endl;
cout<<"Enter name"<<endl;
cout<<"Enter city"<<endl;
cout<<"Enter year of establishment"<<endl;
cout<<"Enter pass percentage"<<endl;
 }
cout<<"Details of colleges"<<endl;
  for(i=1;i<=n;i++)
  {
  cout<<"College:"<<i<<endl<<"Name:"<<c[i].name<<endl<<"City:"<<c[i].city<<endl;
  cout<<"Year of establishment:"<<c[i].establishmentYear<<endl<<"Pass percentage:"<<c[i].pp<<endl;  
  }
 return 0;
}}