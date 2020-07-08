#include<iostream>
using namespace std;
int gcd(int x,int y,int z){
  if(x%z==0 && y%z==0){
    return z;}
  return gcd(x,y,z-1);
}
int main()
{
  int n,m,s;
  cin>>n>>m;
  if(n>m)
    s=m;
  else
    s=n;
  int f=gcd(n,m,s);
  cout << "G.C.D of "<<n<<" and "<<m<<" = "<<f;
}