#include<iostream>
using namespace std;
int main()
{
  int r,c,i=0,j=0;
  cin>>r>>c;
  int a[r][c];
  for(i=0; i<r; i++){
    for(j=0; j<c; j++){
      cin>>a[i][j];
    }
  }
  
    for(i=0; i<c; i++){
    for(j=0; j<r; j++){
      cout<<a[j][i]<<" ";
    }
      cout<<"\n";
  } 
}