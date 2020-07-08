#include <iostream>
using namespace std;
int** createArray(int,int);
int getElement(int** ,int,int);
int** createArray(int r,int c){
  int i=0,j=0,a[r][c],b[r][c];
   for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      cin>>a[i][j];
  }
 }
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      cin>>b[i][j];
  }
 }
 // int c[r][c];
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      cout<<a[i][j]+b[i][j]<<" ";
    }
    cout<<"\n";
  }
}
int main(){
  int r,c;
  cin>>r>>c;
  createArray(r,c);
}
