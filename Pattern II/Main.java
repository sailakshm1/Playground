#include<iostream>
using namespace std;
int main()
{
  int n,i,j,x=1;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i==1)
    {
      cout<<x;
    }
    else
    {
      if(i%2==0)
      {
        x+=i;
        cout<<x;
        for(j=1;j<i;j++)
        {
          cout<<'*'<<x-j;
        }
        x+=1;
      }
      else
      {
        cout<<x;
        for(j=1;j<i;j++)
        {
          x+=1;
          cout<<'*'<<x;
        }
      }
    }
    cout<<"\n";
  }
}