#include<iostream>
using namespace std;
int fib(int n){
  static int t1=0,t2=1,sum;
  if(n==1)
    return t1;
  sum=t1+t2;
  t1=t2;
  t2=sum;
  fib(n-1);
}
int main()
{
  int n;
  cin>>n;
  int f=fib(n);
  cout << "The term "<<n<<" in the fibonacci series is "<<f; 
}