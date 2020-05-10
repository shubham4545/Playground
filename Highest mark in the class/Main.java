#include <iostream>
using namespace std;
#define MAX 50 //Maximum size of the array

/* Recursive function to find the largest element in the given array */
int maximum(int array[], int index, int len)
{
    int max;

    if(index >= len-2)
        return (array[index] > array[index + 1]) ? array[index] : array[index + 1];

    max = maximum(array, index + 1, len);

    return (array[index] > max) ? array[index] : max;
}


/* Recursive function to find the smallest element in the array */

int main()
{
    int array[MAX], N, max;
    int i;
   
    cin >> N;
  
    for(i=0; i<N; i++)
    {
        cin >> array[i];
    }

    max = maximum(array, 0, N);


  
    cout<< max << endl;

    return 0;
}