#include<iostream>
using namespace std;
int main()
{
  int n,f=0,s=1,next;
  cin>>n;
  for(int i=2;i<n;i++)
  {
    next=f+s;
    f=s;
    s=next;
  }
  cout<<next;
}