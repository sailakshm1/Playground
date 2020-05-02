#include<iostream>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int count=0,res=0,temp=n;
  	while(n>0)
    {
      n/=10;
      count++;
    }
   n=temp;
   while(n>0)
   {
     res+=power((n%10),count);
     n/=10;
   }
  if(res==temp)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}