#include <iostream>
using namespace std;

int main() 
{
  int x1,x2,i,j,sum;
  cin >> x1 >> x2;
  for(i=x1; i<=x2; i++){
    sum = 0;
  for(j=1; j<i; j++){
    if(i%j == 0)
      sum = sum + j;
  }
    if(sum == i)
      cout << i << " ";
  }
}