#include<iostream>
using namespace std;
int main()
{
  int sum,n,i;
  sum=0;
cin>>n;
  
  for(i=n-1;i>=0;i--)
  {  sum=sum+i;}
  
  cout<<sum;
}
