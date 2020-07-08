#include<iostream>
using namespace std;
#include<string.h>
int main() {
   char str_inp1[7];
   char str_inp2[7];
   
  cin.getline(str_inp1,10);
  cin.getline(str_inp2,10);//>>str_inp2;
  
//cout<<"String 1:"<<str_inp1<<endl;
//cout<<"String 2:"<<str_inp2<<endl;
 
    if (strcmp(str_inp1, str_inp2) == 0)
        cout << "It is correct" << endl;
    else
        cout << "It is wrong";
  
}