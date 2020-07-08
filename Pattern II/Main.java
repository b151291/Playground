#include <iostream>
using namespace std;

int main()
{
  int n,i,j,k,x=1;
  cin >> n;
    for(i=1; i<=n; i++){
    
      if(i%2==0){
        x=x-1+i;
        k=i;
        while(k != 0){
          cout << x ;
          x--;
          k--;
          if(k!=0)
            cout << "*";
        }
        x++;
      }
      else{
        x=x+i-1;
        k=1;
        while(k<=i){
          cout << x ;
          x++;
          k++;
          if(k<=i)
            cout << "*";
        }
       
      }
      
       cout << "\n";
  }
  }
