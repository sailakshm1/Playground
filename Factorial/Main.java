#include<iostream>
using namespace std;
int factorial(int n)
{
  if(n==1)
    return 1;
  else
    return n*factorial(n-1);
}
int main()
{
  int m;
  cin>>m;
  cout<<"The factorial of "<<m<<" is "<<factorial(m);
  return 0;
 }