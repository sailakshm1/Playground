#include <iostream>
using namespace std;
int main() {
    int n,i,x=1;
  	cin>>n;
  	for(i=1;i<=n;i++)
    {
      if(i%2==0)
      {
        x++;
        cout<<x;
        for(int j=1;j<n;j++)
        {
          cout<<x-1;
        }
      }
      else
      {
        for(int j=1;j<n;j++)
        {
          cout<<x;
        }
        x++;
        cout<<x;
      }
      cout<<"\n";
    }
    return 0;
}