#include<iostream>
#include<string>
using namespace std;
int main()
{
  string hand;
  int num;
  cin >> hand >> num;
  if(hand == "front")
  {
    if(num == 1)
      cout << "Left Handed";
    else
      cout << "Right Handed";
  }
  else
  {
    if(num == 1)
      cout << "Right Handed";
    else
      cout << "Left Handed";
  }
}