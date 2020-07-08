#include<iostream>
using namespace std;
int main()
{
  int m,n,i=0,j=0,g;
  cin>>m>>n;
  int a[m][n];
  for( i=0;i<m;i++){
    for( j=0;j<n;j++){
      cin>>a[i][j];
    }
  }
  for( i=0;i<m;i++){
    for( j=0;j<n;j++){
      if(a[i][0]<=a[i][j]){
        a[i][0]=a[i][j];
        g=a[i][0];
      }
  }
    cout<<g<<"\n";
}
}