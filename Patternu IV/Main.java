#include <iostream>
using namespace std;
int main()
 {
int i,j,n;
cin>>n;
for(i=1;i<=n;i++)
{
    if(i%2==0)
    {
       cout<<i+1;
    }
    for(j=1;j<=n-1;j++)
    {
        cout<<i;
    }
    if(i%2!=0)
    {
        cout<<i+1;
    }
        cout<<endl;
    
   
}
}