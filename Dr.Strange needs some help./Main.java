#include <iostream>
#include <cmath>
int prblm(int, int);
using namespace std;

int main() 
{
  int x, y, z, c;
  cin >> x >> y >> z;
  c = prblm( x, y);
   if(c >= z){
    cout << "Doctor, you can proceed with your experiment.";}
  else{
    cout << "Sorry Doctor! You need more bacteria.";}
}
int prblm(int a, int b)
{
  int ans;
  ans = pow(a, b);
  return ans;
}