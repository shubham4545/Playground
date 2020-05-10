
#include <iostream> 
using namespace std; 
int* insertX(int n, int arr[], 
			int x, int pos) 
{ 
	int i;
	n++; 
	for (i = n; i >= pos; i--) 
		arr[i] = arr[i - 1]; 
	arr[pos - 1] = x; 

	return arr; 
} 
int main() 
{ 
int arr[100] = { 0 }; 
int i, x, pos, n;
cin>>n;
for (i = 0; i <n; i++) 
cin>>arr[i];
cin>>pos; 
cin>>x;
cout<<"Enter the number of elements in the array"<<endl;
cout<<"Enter the elements in the array"<<endl;
cout<<"Enter the location where you wish to insert an element"<<endl;
  if(n>x)
   cout<<"Invalid Input";
  else
  {
cout<<"Enter the value to insert"<<endl;
cout<<"Array after insertion is"<<endl;
insertX(n, arr, x, pos); 
for (i = 0; i < n + 1; i++) 
cout << arr[i] <<endl; }
    return 0; 
  } 