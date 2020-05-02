#include<iostream>
using namespace std;
int main()
{
  int n,e=0,o=0,r;
  cin>>n;
  while(n>0)
  {
   r=n%10;
   if(r%2==0)
     e+=r;
   else
     o+=r;
   n=n/10;
  }
  if(e==o)
	cout<<"Yes";
  else
    cout<<"No";
  //Type your code here.
}