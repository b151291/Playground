#include<iostream>
using namespace std;
int main()
{
  int n,t1=0,t2=1,sum,count=0,temp;
  cin >> n;
  while(count < n){
    //cout << t1 << "\n";
    temp = t1;
    sum = t1 + t2;
    t1 = t2;
    t2 =sum;
    count += 1;
  }
  cout << temp;
}