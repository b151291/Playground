#include<iostream>
#include<string>
int main() 
{ 
std::string str;
std::getline(std::cin,str);
for(auto i=str.crbegin();i<str.crend();i++){
  std::cout<<*i<<"";
}
}