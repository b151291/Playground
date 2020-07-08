#include<iostream>
#include<string>
using namespace std;
int main()
{
  string name1,name2,name3;
  getline(std::cin,name1);
  getline(std::cin,name2);
  int j=name1.length()-1,temp;
  for(int i=0;i<j;i++,j--){
    temp=name1[i];
    name1[i] = name1[j];
    name1[j]=temp;
  }
  //cout<<name2;
   if(name2 == name1)
     cout<<"It is correct";
   else
     cout<<"It is wrong";
}