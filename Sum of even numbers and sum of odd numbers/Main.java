#include <iostream>
using namespace std;
int main()
{
int i, num,k;  
int oddSum=0,evenSum=0;
cin>>num;
for(i=1; i<=num; i++)
{cin>>k;
if(k%2==0)
evenSum=evenSum+k;
else
oddSum=oddSum+k;
}
cout<<"The sum of the even numbers in the array is "<< evenSum;
cout<<"\nThe sum of the odd numbers in the array is "<<oddSum;
return 0;
}