#include<iostream>
using namespace std;
int main()
{
  int b,y;
  cin>>b>>y;
  if (y==00)
  {
    cout<<100-b;
  }
  else if (b==00)
  {
    cout<<100+y;
  }
  else if (b>y)
    cout<<100-b+y;
  else
  	cout<<y-b;
  //Type your code here.
}