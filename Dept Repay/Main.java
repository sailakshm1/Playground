#include<iostream>
using namespace std;
int main()
{
  int p,r,y;
  cin>>p;
  cin>>r;
  cin>>y;
  int i=p*y*r/100;
  cout<<i<<endl;
  cout<<p+i<<endl;
  float d;
  d=(float(i)*2)/100;
  cout<<d<<endl;
  cout<<p+i-d;
  //Type your code here.
}