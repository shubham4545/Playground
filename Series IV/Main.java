#include<iostream>
using namespace std;
int main()
{
 int i,j,n;
  cin>>n;
  for(i=1;i<=n;i++)
  {
  if (i%2==0)
  {
  j=i*i-2;
  cout<<j<<" ";
  }
  else{
  
  j=i*i-1;
  
  cout<<j<<" ";
  }
  
  
  }
}