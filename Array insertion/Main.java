#include <iostream>
using namespace std;

int main() 
{
  int n,p,v;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<"\n";
  for(int i=1; i<=n; i++){
    cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element"<<"\n";
  cin>>p;
  if(p<=n){
  cout<<"Enter the value to insert"<<"\n";
  cin>>v;
  cout<<"Array after insertion is"<<"\n";
  for(int i=1;i<=n+1;i++){
    if(i==p){
      cout<<v<<"\n";
      break;
      }
    else
      cout<<a[i]<<"\n";
    
  }
  for(int i=p; i<=n; i++)
    cout<<a[i]<<"\n";
  }
  else
    cout<<"Invalid Input";
    
}