#include<iostream>
using namespace std;
int main()
{
  int r,s=0,n,t;
  cin>>n;
  t=n;
  while(n>0)
  {
    r=n%10;
    s+=r;
    n=n/10;
  }
  if(t%s==0)
  {
  	cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }
  //Type your code here.
}