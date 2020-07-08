#include<iostream>
using namespace std;
int main()
{
  int n,r,e=0,o=0;
  cin >> n;
  while(n>0){
    r=n%10;
    //cout << r << "\n";
    if(r%2 == 0)
      e = e+r;
    else
      o = o+r;
    n = n/10;
  }
  if(e == o)
    cout << "Yes";
  else
    cout << "No";
}