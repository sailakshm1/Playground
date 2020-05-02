#include<iostream>
using namespace std;
int fibonacci(int n)
{
 int f=0,s=1,next;
  if(n==1)
  	return 0;
  else if(n==2)
    return 1;
  else
    for(int i=3;i<=n;i++)
    {
      next=f+s;
      f=s;
      s=next;
    }
  return next;
}
int main()
{
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fibonacci(n);
  //Type your code here.
}