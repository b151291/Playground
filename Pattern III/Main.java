#include <iostream>
using namespace std;

int main() 
{
  int n,i,j;
  cin >> n;
  for(i=1; i<=n; i++){
    j=1;
    while(j<=i){
      cout << i;
      j++;
      if(j<=i)
        cout << "*";}
    cout << "\n";
  }
        if(i==n+1){
        for(i=n; i>0; --i){
          j=1;
          while(j<=i){
            cout << i;
            j++;
            if(j<=i)
              cout << "*";
          }
          cout << "\n";
        }
      }
  }
