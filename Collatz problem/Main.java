#include<iostream>
using namespace std;
int main()
{
 int n,count = 0;
 cin >> n;
 if(n==1){
   cout << n << "\n";
 }
 while(n>1){
   cout << n << "\n";
   if(n%2 == 0){
     n = n/2;
     if(n == 1)
       cout << n << "\n";
     count += 1;}
   else{
     n = 3*n + 1;
     count += 1;}
 }
  cout << count;
}