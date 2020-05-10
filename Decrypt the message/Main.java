#include <iostream> 
using namespace std; 

int main()
{
	int n,i=1,sum=0,m,l;


	cin>>n;
  cin>>m;
  l=n+m;
	while(i<l)
	{
		if(l%i==0)
			sum=sum+i;
		i++; 
	}

	if(sum==l)
		cout <<"They can read the message"; 
	else
		cout <<"They can't read the message" ;

	return 0;
}
