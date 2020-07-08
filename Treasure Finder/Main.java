#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin >> a >> b >> c;
  if(a>b)
  {
    if(a>c)
    {
      if(b>c){
        cout <<"The treasure is in box which has number "<< b <<"\n";
        if(a%c == 0 && b%c == 0)
          cout <<"The code to open the box is "<< c;
        else
          cout <<"The code to open the box is 1";}
      else{
        cout <<"The treasure is in box which has number "<< c <<"\n";
        if(a%b == 0 && c%b == 0)
          cout <<"The code to open the box is "<< b;
        else
          cout <<"The code to open the box is 1";}
    }
    else{
      cout <<"The treasure is in box which has number "<< a <<"\n";
      if(a%b == 0 && c%b == 0)
          cout <<"The code to open the box is "<< b;
      else
          cout <<"The code to open the box is 1";}
  }
  else
  {
    if(b>c)
    {
      if(a>c){
        cout <<"The treasure is in box which has number "<< a <<"\n";
        if(a%c == 0 && b%c == 0)
          cout <<"The code to open the box is "<< c;
        else
          cout <<"The code to open the box is 1";}
      else{
        cout <<"The treasure is in box which has number "<< c <<"\n";
        if(b%a == 0 && c%a == 0)
          cout <<"The code to open the box is "<< a;
        else
          cout <<"The code to open the box is 1";}
    }
    else{
      cout <<"The treasure is in box which has number "<< b <<"\n";
      if(b%a == 0 && c%a == 0)
          cout <<"The code to open the box is "<< a;
      else
          cout <<"The code to open the box is 1";}
  }
  
      
      
      
      
      
}