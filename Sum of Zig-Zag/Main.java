#include<iostream>
using namespace std;
const int Max=10;
int sumZigZag(int n,int m,int a[][Max])
{
  int sum=0;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      if(i==0 || i==n-1 || i==j)
        sum+=a[i][j];
    }
  }
  return sum;
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
  cout<<"Sum of Zig-Zag pattern is "<<sumZigZag(n,m,a);
}