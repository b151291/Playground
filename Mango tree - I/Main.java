#include<iostream>
using namespace std;
int main()
{
  int r,c,m;
  cin >> r >> c >> m;
  if((m >= 1 && m <= r) || (m > c*r - r) || (m-1)%r == 0)  
    cout << "Yes";
  else
    cout << "No";
}