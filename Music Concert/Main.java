#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int *p=(int *)calloc(n,sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(p+i);
  }
  int f=0,m=0;
  for(int i=0;i<n;i++)
  {
    if(*(p+i)%2==0)
    {
      f++;
    }
    else
      m++;
  }
  cout<<m<<"\n";
  cout<<f;
}