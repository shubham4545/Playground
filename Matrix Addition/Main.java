#include<iostream>
using namespace std;
int main()
{
int r,c,i,j;
int a[10][10];
int b[10][10];
int d[10][10];
cin>>r>>c;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
cin>>a[i][j];
}
}
  for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
cin>>b[i][j];
}
}
for(i=0;i<c;i++)
{
for(j=0;j<r;j++)
{
d[i][j]=a[i][j]+b[i][j];
  cout<<d[i][j]<<" ";
}
cout<<"\n";
}
}