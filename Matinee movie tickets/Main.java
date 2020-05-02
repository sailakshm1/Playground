#include<iostream>
using namespace std;
int main()
{
  int age;
  float showTime;
  cin>>age;
  cin>>showTime;
  float matinee=13.30;
  if (showTime==matinee)
  {
    if (age>13)
    	cout<<"$5.00";
    else
      cout<<"$2.00";
  }
  else
  {
    if (age>13)
      cout<<"$8.00";
    else
      cout<<"$4.00";
  }
}