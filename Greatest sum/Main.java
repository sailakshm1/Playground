#include<iostream>
using namespace std;
const int Max=10;
void rowSum(int n,int m,int a[][Max])
{
  int max=0,sumMax=0;
  cout<<"Sum of rows is ";
  for(int i=0;i<n;i++)
  {
    int sum=0;
    for(int j=0;j<m;j++)
    {
        sum+=a[i][j];
    }
    cout<<sum<<" ";
    if(sum>sumMax)
    {
      sumMax=sum;  
      max=i+1;
    }
  }
  cout<<"\nRow "<<max<<" has maximum sum";
}        
void colSum(int n,int m,int a[][Max])
{
  int max=0,sumMax=0;
  cout<<"\nSum of columns is ";
  for(int i=0;i<m;i++)
  {
    int sum=0;
    for(int j=0;j<n;j++)
    {
        sum+=a[j][i];
    }
    cout<<sum<<" ";
    if(sum>sumMax)
    {
        sumMax=sum;
        max=i+1;
    }
  }
  cout<<"\nColumn "<<max<<" has maximum sum";
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
  colSum(n,m,a);
}