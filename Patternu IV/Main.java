#include <iostream>
using namespace std;

int main() 
{
  int n,i,j,k;
  cin >> n;
  for(i=1;i<=n;i++){
      if(i%2 == 0){
        k=1;
        while(k <= n){
          if(k == 1)
            cout << i+1;
          else
            cout << i;
          k++;
        }
      }
      else{
        k=1;
        while(k < n)
        {
          cout << i;
          k++;
          if(k==n){
            cout << i+1;
            k++;}
          
        }
      }
    cout << "\n";
  }
}