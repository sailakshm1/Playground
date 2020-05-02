#include<iostream>
using namespace std;
int gcd(int x,int y,int z)
{
  int small;
  if(x<y && x<z)
    small=x;
  else if(y<z)
    small=y;
  else
    small=z;
  for(int i=small;i>=1;i--)
  {
    if(x%i==0 && y%i==0 && z%i==0)
    {
      return i;
      break;
    }
  }
}
int main()
{
  int x,y,z,result;
  cin>>x>>y>>z>>result;
  if(gcd(x,y,z)==result)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}
  
  	   