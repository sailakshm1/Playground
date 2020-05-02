#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char door[10];
  int rail;
  cin>>door;
  cin>>rail;
  string f="front";
  string r="rear";
  switch(rail)
  {
    case 1:
      if(door==f)
        cout<<"Left Handed";
      else
        cout<<"Right Handed";
      break;
    default:
      if(door==r)
        cout<<"Left Handed";
      else
        cout<<"Right Handed";
      break;
  }
}