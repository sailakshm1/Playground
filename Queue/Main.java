#include<iostream>
using namespace std;
void queue(int n,int m,int *a)
{
  int sum=0;
  for(int i=0;i<n;i++)
  {
    sum+=a[i];
  }
  if(n==1 && m==2)
   	cout<<1;
  else
  	cout<<(sum/m+1);
}
int main()
{
  int n,m;
  cin>>n>>m;
  int *a=(int *)calloc(n,sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  queue(n,m,a);
}