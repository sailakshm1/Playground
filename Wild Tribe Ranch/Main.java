#include<iostream>
using namespace std;
int main()
{
  int m,w;
  cin>>m>>w;
  if(m>w)
  {
    cout<<"Yes, you can enter.";
  }
  else if(m==w)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
  	cout<<"Sorry, you can't enter";
}