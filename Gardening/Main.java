#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  cin>>r>>c>>n;
  if(n==c+c)
    cout<<"It is a mango tree";
  else if(n==r*c-c)
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
  //Type your code here.
}