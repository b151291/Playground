#include <iostream>
using namespace std;

int main() 
{
  int x,y,ch;
  cout << "Enter first number : "<<"Enter second number : "
     << "Menu\n"<<"1.Addition\n"<<"2.Subtraction\n"<<"3.Multiplication\n"
    <<"4.Division\n"<<"5.Remainder\n";
  cin >> x >> y >> ch;
  switch(ch)
  {
    case 1:
      cout << x+y;
      break;
    case 2:
      cout << x-y;
      break;
    case 3:
      cout << x*y;
      break;
    case 4:
      cout << x/y;
      break;
    case 5:
      cout << x%y;
      break;
    default:
      cout << "Invalid operation";
  }
}