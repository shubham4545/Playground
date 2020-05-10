#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int main()
{
	// declare variable
	string name="";
	getline(cin,name);

	// built in C++ function to reverse an std::string
	reverse(name.begin(), name.end());
	
	cout <<name << endl;

	return 0;
}