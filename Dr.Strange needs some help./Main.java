#include<iostream>
#include<math.h>
using namespace std;
int main()
{
int m,n,req;
cin>>m>>n>>req;
m=pow(m,n);
if(m>=req)
cout<<"Doctor, you can proceed with your experiment.";
else
cout<<"Sorry Doctor! You need more bacteria.";
}

