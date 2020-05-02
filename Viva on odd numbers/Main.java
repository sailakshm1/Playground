#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  float score=0.0;
  cin>>n;
  while(n>0 && c<3)
  {
   if(n%2==0)
   {
     score-=0.5;
   }
    else
    {
      score+=1.0;
      c+=1;
    }
    cin>>n;
    if(n<0)
      score-=1;
  }
  cout<<score;
}