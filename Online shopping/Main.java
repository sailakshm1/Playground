#include<iostream>
using namespace std;
int main()
{
  int p1,d1,s1,p2,d2,s2,p3,d3,s3;
  cin>>p1>>d1>>s1>>p2>>d2>>s2>>p3>>d3>>s3;
  int a1=p1-p1*d1/100+s1;
  int a2=p2-p2*d2/100+s2;
  int a3=p3-p3*d3/100+s3;
  cout<<"In Flipkart Rs."<<a1;
  cout<<"\nIn Snapdeal Rs."<<a2;
  cout<<"\nIn Amazon Rs."<<a3;
  if (a1<=a2 && a1<=a3)
    cout<<"\nHe will prefer Flipkart";
  else if (a2<a3)
    cout<<"\nHe will prefer Snapdeal";
  else
    cout<<"\nHe will prefer Amazon";
}