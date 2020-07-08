#include<iostream>
using namespace std;
int main()
{
  int ni;
  float ht;
  cin >> ni >> ht;
  if(ni <= 3)
  {
    if(ni == 2)
      cout << ht*(1 + 0.5);
    else if(ni == 3)
      cout << ht*2;
    else
      cout << ht;
  }
  else 
    cout << "Number of items is more";
}