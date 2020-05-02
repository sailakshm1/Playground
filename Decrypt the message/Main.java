#include<iostream>
using namespace std;
int main()
{
  int n,e,res,s=0;
  cin>>e>>n;
  res=n+e;
  for(int i=1;i<res;i++)
  {
    if(res%i==0)
      s+=i;
  }
  if(s==res)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}