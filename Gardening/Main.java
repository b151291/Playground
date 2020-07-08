#include<iostream>
using namespace std;
int main()
{
  int r,c,m;
  cin >> r >> c >> m;
  if((m >= r+1 && m <= 2*r) || (m > r*(c-2) && m <= r*(c-1)))
     cout << "It is a mango tree";
  else
     cout << "It is not a mango tree";
}