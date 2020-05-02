#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n,r;
  cin>>n;
  while(n>0)
  {
    r=n%10;
    cout<<r;
    n=n/10;
  }
	return 0;
}