#include<iostream>
using namespace std;
int main()
{
  int by,cr;
  cin >> by >> cr;
  if(cr <= by)
    cout << cr+100 - by;
  else
    cout << cr - by;
}