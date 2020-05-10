#include<iostream>
using namespace std;
int main(){
 int n,i,j=0,k=0;
  cin>>n;
  int a[10];
  for (i=0;i<n;i++)
  {  cin>>a[i];}
  for(i=0;i<n;i++){
  if(a[i]%2==0)
  {
   j++;
  }
    else{
    
    k++;
    
    
    }
    
 
}
cout<<k<<endl<<j;


}