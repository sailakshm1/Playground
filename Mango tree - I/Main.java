#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  cin>>r>>c>>n;
  if((n-1)%r==0||n<=c || n%c==0)
    cout<<"Yes";
  else
    cout<<"No";
  //Type your code here.
}