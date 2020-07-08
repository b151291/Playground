#include<iostream>
#include<string>
using namespace std;
int main()
{
  string name;
  getline(std::cin, name);
  int c=0;
  for(int i=0;i<name.length();i++)
    c=c+1;
  cout<<"The number of letters in the name is "<<name.length();
}