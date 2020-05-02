#include<iostream>
using namespace std;
int main()
{
  int n;
  float h;
  cin>>n;
  cin>>h;
  if(n==1)
  {
    float r=h;
    cout<<r<<endl;
  }
  else if(n==2)
  {
    float r=h+(h/2);
    cout<<r<<endl;
  }
  else if(n==3)
  {
    float r=h+h;
    cout<<r<<endl;
  }
  else
  {
    cout<<"Number of items is more";
  }
}