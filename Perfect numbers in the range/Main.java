#include<iostream>
using namespace std;
int main()
{
  int l,h,c=0;
  cin>>l>>h;
  for(int i=l;i<=h;i++)
  {
    int s=0;
    for(int j=1;j<i;j++)
    {
      if(i%j==0)
        s+=j;
    }
    if(s==i)
    {
      cout<<i<<" ";
    }
  }
}