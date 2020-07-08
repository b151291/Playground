#include<iostream>
using namespace std;
int main()
{  
   char c;
   int i;
   float f;
   double d;
   cin >> c >> i >> f >> d ;
   cout << sizeof(c) << '\n';
   cout << sizeof(i) << '\n';
   cout << sizeof(f) << '\n';
   cout << sizeof(d) << '\n';
}