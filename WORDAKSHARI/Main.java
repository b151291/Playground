#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int i,n=4;
  string str[n];
  for(i=0;i<n;i++){
      getline(std::cin,str[i]);
  }
   for(i=0;i<n;i++){
     if(!((str[i][0]>='a'&&str[i][0]<='z')||(str[i][0]>='A'&&str[i][0]<='Z')))
       break;
     else
       cout<<str[i]<<"\n";
   }
}