#include <iostream>
using namespace std;

int main() {
 int a,b;
   
  
    cin>>a;
    cin>>b;
cout<<"Before swapping a= "<<a<<" and b="<<b<<endl;
    a=a+b;
    b=a-b;
    a=a-b;
    cout<<"After swapping a= "<<a<<" and b="<<b;
    return 0;}