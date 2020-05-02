#include<iostream>
using namespace std;
const int Max=10;
int rowSum(int n,int m,int a[][Max])
{
  for(int i=0;i<n;i++)
  {
    int sum=0;
    for(int j=0;j<m;j++)
    {
       sum+=a[i][j];
    }
    cout<<sum<<"\n";
  }
}
int main()
{
  int n,m;
  cin>>n>>m;
  int a[Max][Max];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      cin>>a[i][j];
    }
  }
  rowSum(n,m,a);
}