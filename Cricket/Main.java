#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int tb,tr,ir,ib,to,v;
  float tof,rr,trr;
  std::cin>>tb;
  std::cin>>tr;
  std::cin>>ir;
  std::cin>>ib;
  to=tb/6.0;
  std::cout<<to<<"\n";
  tof=ib/6;
  v=ib%6;
  tof+=(v*0.1);
  std::cout<<tof<<"\n";
  rr=ir/tof;
  std::cout<<fixed<<setprecision(1)<<rr<<"\n";
  trr=float(tr)/to;
  std::cout<<trr<<"\n";
  if(rr*(to-tof)>=tr)
    std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";
}