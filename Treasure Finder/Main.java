#include<iostream>
using namespace std;
int main()
{
  int n1,n2,n3,l,r;
  cin>>n1>>n2>>n3;
  if(n1>n2 && n1>n3)
  {
    if(n2>n3)
    {
      l=n3;
      cout<<"The treasure is in box which has number "<<n2;
    }
    else
    {
      l=n2;
      cout<<"The treasure is in box which has number "<<n3;
    }
  }
   else if(n2>n3 && n2>n1)
   {
     if(n1>n3)
     {
       l=n3;
     	cout<<"The treasure is in box which has number "<<n1;
     }
     else
     {
       l=n1;
     	cout<<"The treasure is in box which has number "<<n3;
     }
   }
    else
    {
      if(n1>n2)
      {
      l=n2;
      cout<<"The treasure is in box which has number "<<n1;
      }
      else
      {
        l=n1;
        cout<<"The treasure is in box which has number "<<n2;
      }
    }
  for(int i=l;i>0;i--)
  {
   if (n1%i==0 && n2%i==0 && n3%i==0)
   {
     r=i;
     break;
   }
  }
  cout<<"\nThe code to open the box is "<<r;
}