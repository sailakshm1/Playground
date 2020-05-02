#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int lit,dist;
  cin>>mileage>>lit>>dist;
  if (mileage*lit>=dist)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  //Type your code here.
}