#include<iostream>
using namespace std;
void swap(int &a,int &b)
{
  a+=b;
  b=a-b;
  a=a-b;
}
int main()
{
  int x,y;
  cin>>x>>y;
  cout<<"Before swapping a= "<<x<<" and b="<<y;
  swap(x,y);
  cout<<"\nAfter swapping a= "<<x<<" and b="<<y;
}