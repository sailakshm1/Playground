#include<iostream>
using namespace std;
int gcd(int a,int b)
{
  if(a<b)
  {
    a+=b;
    b=a-b;
    a-=b;
  }
  if(a%b==0)
    return b;
  else
    return(gcd(b,a%b));
}
    
int main()
{
  int n,m;
  cin>>n>>m;
  cout<<"G.C.D of "<<n<<" and "<<m<<" = "<<gcd(n,m);
}