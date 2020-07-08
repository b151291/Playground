#include <iostream>
using namespace std;
int drt(int n){
  int s=0,c=0;
  while(n>0){
     s=s+n%10;
     n=n/10;
     c=c+1;
  }
  if(c==1)
    return s;
  else
    return drt(s); 
}
int main() 
{
   int n;
   cin>>n;
   int f=drt(n);
   cout << f;
}