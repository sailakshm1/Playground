#include<iostream>
using namespace std;
int main()
{
  int n,c;
  cin>>n;
  do{
    c++;
    n=n/10;
  }while(n>0);
  cout<<c;
  // Type your code here
}