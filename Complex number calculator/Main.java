#include<iostream>
using namespace std;
#include<math.h>

struct complex
{
float rel;
float img;
}s1,s2;

int main()
{
int j;
float a,b;
  cin>>j;

cin>>s1.rel>>s1.img;

cin>>s2.rel>>s2.img;
switch(j)
  { case 1:
a=(s1.rel)+(s2.rel);
b=(s1.img)+(s2.img);
cout<<a<<"+"<<b<<"i";
break;
   case 2:
//Subtraction
a=(s1.rel)-(s2.rel);
b=(s1.img)-(s2.img);
cout<<a<<"+"<<b<<"i";
break;
   case 3:
//Multiplication
a=((s1.rel)*(s2.rel))-((s1.img)*(s2.img));
b=((s1.rel)*(s2.img))+((s2.rel)*(s1.img));
cout<<a<<""<<b<<"i";
break;
   default:
   cout<<"Invalid choice";
  }

}

