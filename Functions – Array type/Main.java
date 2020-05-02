#include<iostream>
using namespace std;
int function(int n,int *a)
{
  int e=0,o=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      e++;
    else
      o++;
  }
  if(n==e)
    return 1;
  else if(n==o)
    return 2;
  else
    return 3;
}
  
int main()
{
  int n;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int a[n];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
  	cin>>a[i];
  int c=function(n,a);
  if(c==1)
    cout<<"\nThe array is Even";
  else if(c==2)
    cout<<"\nThe array is Odd";
  else
    cout<<"\nThe array is Mixed";
}