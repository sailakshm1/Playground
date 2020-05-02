#include<iostream>
using namespace std;
int bacteria_mul(int,int);
int main()
{
  int m,n,r;
  cin>>m>>n>>r;
  if(bacteria_mul(m,n)>=r)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
	cout<<"Sorry Doctor! You need more bacteria.";
  }
  return 0;
}
int bacteria_mul(int m,int n)
{
  int req=m;
  for(int i=1;i<n;i++)
  {
    req*=m;
  }
  return req;
}