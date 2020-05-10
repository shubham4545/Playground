#include<iostream>
using namespace std;
int main()

{
  int n,sum,i;
  sum=1;
cin>>n;
  for(i=1;i<=n;i++)
  { 
  sum=sum*i;
  }
  cout<<sum;
}