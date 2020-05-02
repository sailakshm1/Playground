#include<iostream>
using namespace std;
int main()
{
 int d1,c1,d2,c2,d,c;
 cin>>d1>>c1>>d2>>c2;
 d=d1+d2;
 c=c1+c2;
 while(c>=100)
 {
   d+=1;
   c-=100;
 }
  cout<<d<<"\n"<<c;//Type your code here.
}