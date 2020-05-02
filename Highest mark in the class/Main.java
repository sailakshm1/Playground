#include<iostream>
int main()
{
  int n,max=0;
  std::cin>>n;
  int marks[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>marks[i];
  }
  for(int i=0;i<n;i++)
  {
    if(marks[i]>max)
    {
      max=marks[i];
    }
  }
  std::cout<<max;
}