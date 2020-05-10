
// CPP program to print Collatz sequence 
#include <bits/stdc++.h> 
using namespace std; 
int a=1;
void printCollatz(int n) 
{ 
	// We simply follow steps 
	// while we do not reach 1 
	while (n != 1) 
	{ 
      ++a;
		cout << n <<endl; 

		// If n is odd 
		if (n & 1) 
			n = 3*n + 1; 

		// If even 
		else
			n = n/2; 
	} 

	// Print 1 at the end 
	cout << n<<endl<<a-1; 
} 

// Driver code 
int main() 
{ int m;
 cin>>m;
	printCollatz(m); 
	return 0; 
} 
