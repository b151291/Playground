#include <iostream>
using namespace std;

int main() 
{
  int mw,pw;
  cin >> mw >> pw ;
  if(pw < mw)
    cout << "Yes, you can enter.";
  else if(pw == mw)
    cout << "Yes, you can enter. Kindly use a rope.";
  else
    cout << "Sorry, you can't enter";
}