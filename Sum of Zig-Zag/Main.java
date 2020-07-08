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
  for( i=0;i<n;i++){
    if(i==n-1 || i==0){
      for( j=0;j<m;j++){
          s+=a[i][j];
      }
    }
    else{
      j=n-i-1;
      s=s+a[i][j];
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<s;
}