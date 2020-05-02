#include<iostream>
using namespace std;
int main()
{
  int m,c=0;
  cin>>m;
  for(int i=m;i>0;i--)
  {
    if(m%i==0)
    {
      c+=1;
    }
  }
  if(c==2)
  {
    cout<<"Eligible";
  }
  else
  {
    cout<<"Not eligible";
  }
}