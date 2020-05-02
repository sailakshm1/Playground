#include<iostream>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    cout<<i;
    for(j=1;j<i;j++)
    {
      cout<<'*'<<i;
    }
    cout<<"\n";
  }
  for(i=n;i>0;i--)
  {
    cout<<i;
    for(j=1;j<i;j++)
    {
      cout<<'*'<<i;
    }
    cout<<"\n";
  }
}