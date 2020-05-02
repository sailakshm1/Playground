#include<iostream>
using namespace std;
int main()
{
  int n,x=11,i;
  cin>>n;
  for(i=0;i<n;i++)
  {
	cout<<x*x<<" ";
    x+=4;
  }
}