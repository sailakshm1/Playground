#include<iostream>
using namespace std;
int main()
{
  int x=11,n;
  cin>>n;
  
  while(n>0)
  {
    cout<<x*x<<" ";
    x+=4;
    n--;
  }
}