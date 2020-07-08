#include<iostream>
using namespace std;
int main()
{
  int n,f,c=0;
  cin >> n;
  int a[n];
  for(int i=0; i<n; i++){
    cin>>a[i];
  }
  cin >> f;
  for(int i=0; i<n; i++){
    if(a[i]==f){
      cout<<"She passed her exam";
      break;}
    c=c+1;
  }
  if(c==n)
    cout<<"She failed";
}