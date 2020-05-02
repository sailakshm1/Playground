#include<iostream>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  int t=n;
  for(i=0;i<4;i++)
  {
    for(j=0;j<=i;j++)
    {
      cout<<n;
    }
    n++;
    cout<<"\n";
  }
  for(i=4;i>0;i--)
  {
    n--;
    for(j=0;j<i;j++)
    {
      cout<<n;
    }
    cout<<"\n";
  }
}