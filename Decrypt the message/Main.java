#include <iostream>
using namespace std;

int main() 
{
  int en,ent,i=1,sum=0;
  cin >> en >> ent;
  int n = en+ent;
  while(i < n){
    if(n%i == 0)
      sum = sum+i;
      i++;
  }
  if(sum == n)
    cout << "They can read the message";
  else
    cout << "They can't read the message";
}