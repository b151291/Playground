#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{  
    int a,s=0,t,c=0;
    a = n;
    t = n;
    while(n>0){
      c = c + 1;
      n=n/10;
    }
  
  while(a>0){
      int r = a%10;
      s = power(r ,c) + s;
      a=a/10;
  }
    if(s == t)
      return 1;
   else
     return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}