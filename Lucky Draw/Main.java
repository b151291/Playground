#include <iostream>
using namespace std;

int main() 
{
   int n,i=1,c=0;
   cin >> n;
   while(i<=n){
     if(n%i==0){
       c += 1;
       }
     i++;
   }
  if(c == 2)
    cout << "Eligible";
  else 
    cout << "Not eligible";
     
}