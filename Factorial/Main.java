#include<iostream>
using namespace std;
int fact(int n){
   if(n==0 || n==1){
     return 1;}
  int facto = n*fact(n-1);
  return facto;
}
int main()
{
  int n;
  cin>>n;
  int f=fact(n);
  cout<<"The factorial of "<<n<<" is "<<f;
}