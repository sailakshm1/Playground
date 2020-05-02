#include<iostream>
using namespace std;
void print(int r)
{
  if(r%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}
int main()
{
  int res,n,m;
  cin>>n>>m;
  if(n<m)
  {
    res=n;
  }else{
    res=m;
  }
  print(res);
}