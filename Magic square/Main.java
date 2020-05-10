#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int mat[n][n];
  int sum=0;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>mat[i][j];
      if(i==j)
      {
        sum=sum+mat[i][j];
      }
    }
  }
  int sum1=0,sum2=0,sum3=0;
  int flag=1;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      sum1+=mat[i][j];
      sum2+=mat[j][i];
      if(i+j+1==n)
        sum3+=mat[i][j];
    }
    if((sum!=sum1) || (sum2!=sum))
    {
      flag=0;
      break;
    }
    sum1=0;
    sum2=0;
  }
  if((flag==1) && (sum==sum3))
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}