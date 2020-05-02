#include<iostream>
using namespace std;
int Sumdigits(int m)
{
  int s=0;
  while(m>0)
  {
    s+=m%10;
    m/=10;
  }
  if(s<=9)
    return s;
  else
    Sumdigits(s);
}
int main()
{
  int n;
  cin>>n;
  cout<<Sumdigits(n);
}