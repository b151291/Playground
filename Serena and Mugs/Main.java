#include <iostream>
using namespace std;
int printresult(int*x,int y,int z){
  int t=0;
  for(int i=0; i<y; i++){
    t=t+ *(x+i);
   
  }
  if(t<=z)
     cout<<"YES";
  else
    cout<<"NO";
}
  
int main() 
{
  int n,s;
  cin>>n>>s;
  int a[n];
  for(int i=0; i<n; i++){
    cin>>a[i];
  }
  printresult(a, n, s);
}