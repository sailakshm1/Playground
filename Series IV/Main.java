#include<iostream>
using namespace std;
int main()
{
  int n,s,x=0,i;
  cin>>n;
  for(i=0;i<n;i+=1)
  {
    if(i>0 && i%2==0)
    {
      s+=4;
    }
    if(i==0)
    {
      cout<<x<<" ";
      x+=2;
    }
    else if(i==1)
    {
      cout<<x<<" ";
      s=2;
    }   
    else
    {
     x+=s;
     cout<<x<<" ";
    }
  }
}