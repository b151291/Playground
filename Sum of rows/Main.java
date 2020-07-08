#include<iostream>
using namespace std;
int main()
{
  int m,n,i=0,j=0,s=0;
  cin>>m>>n;
  int a[m][n];
  for( i=0;i<m;i++){
    for( j=0;j<n;j++){
      cin>>a[i][j];
    }
  }
  for( i=0;i<m;i++){
    s=0;
    for( j=0;j<n;j++){
      s=s+a[i][j];
      }
    cout<<s<<"\n";
  }
   
}
