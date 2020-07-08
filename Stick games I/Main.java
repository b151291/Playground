#include <iostream>
using namespace std;
void print(int n,int m){
  if(n==2)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}
int main() 
{
  int n,m;
  cin>>n>>m;
  print(n,m);
}