#include<iostream>
using namespace std;
int main()
{
  int n,reg,flag=false;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>reg;
  for(int i=0;i<n;i++)
  {
    if(a[i]==reg)
    {
      flag=true;
      break;
    }
  }
  if(flag==true)
  {
    cout<<"She passed her exam";
  }
  else
    cout<<"She failed";
}