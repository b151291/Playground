#include<iostream>
using namespace std;
int main()
{
  int ta,n,s=0,c=0;
  cin >> ta;
  while(s < ta){
    cin >> n;
    s = s + n;
    c = c + 1;}
  cout << "The number of turns is " << c;
}