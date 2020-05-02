#include<iostream>
using namespace std;
const int Max=10;
int findmax(int n,int m,int a[][Max])
{
  for(int i=0;i<m;i++)
  {
    int max=0;
    for(int j=0;j<n;j++)
    {
      if(a[j][i]>max)
        max=a[j][i];
    }
    cout<<max<<"\n";
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
  findmax(n,m,a);
}