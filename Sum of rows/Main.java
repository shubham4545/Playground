#include<iostream>
using namespace std;
int main()
{int m, n, row, col, sum = 0, row_ind = 0, col_ind = 0;
cin >> m >> n;
int row_arr[m];
int i, j;
int mat[m][n];
for(i = 0; i < m; i++)
{for(j = 0; j < n; j++)
cin >> mat[i][j];}
int z = 0;
for(row=0; row<m; row++)
{sum = 0;
for(col=0; col<n; col++){
sum += mat[row][col];
}
cout <<sum<<endl;
row_arr[z++] = sum;
}
int temp_row = row_arr[0];
for(i=1;i<m;i++){
if(temp_row < row_arr[i])
{temp_row = row_arr[i];
row_ind = i;}
}
return 0;
}