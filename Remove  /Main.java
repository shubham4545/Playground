#include<iostream>
using namespace std;
int main()
{
  string s;
  getline(cin,s);
  int found=s.find("the");
  s.erase(found,4);
  found=s.find("the");
  s.erase(found,4);
cout<<s;
return 0;
}