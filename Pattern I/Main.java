#include <iostream>
using namespace std;

int main() 
{
   int n,t,i,j;
   cin >> n;
   t = n;
   for(i=0; i<4; i++){
     for(j=0; j<=i; j++){
       cout << n << "";
     }
     n++;
     cout << "\n";
   }
     if(n==t+4){
       for(i=3; i>=0; i--){
         n--;
         for(j=0; j<=i; j++){
           std:cout << n << "";
         }
         cout << "\n";
       }
     }
   
}
