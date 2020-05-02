#include<iostream>
using namespace std;
int main()
{
  int sun,mon,tue,wed,thu,fri,sat;
  int x,y,w1,w2,w3,w4,w5,w6,w7,w8=0;//Type your code here.
  int ed,td,tr;
  cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
  w1=sun*150;
  w7=sat*125;
  if(mon<=8)
  {
    w2=mon*100;
  }
  else if(mon>8)
  {
    x=mon-8;
    y=(x*100)+x*15;
    w2=y+800;
  }
  if(tue<=8)
  {
    w3=tue*100;
  }
  else if(tue>8)
  {
    x=tue-8;
    y=x*15+(x*100);
    w3=y+800;
  }
  if(wed<=8)
  {
    w4=wed*100;
  }
  else if(wed>8)
  {
    x=wed-8;
    y=x*15+(x*100);
    w4=y+800;
  }
  if(thu<=8)
  {
    w5=thu*100;
  }
  else if(thu>8)
  {
    x=thu-8;
    y=x*15+(x*100);
    w5=y+800;
  }
  if(fri<=8)
  {
    w6=fri*100;
  }
  else if(fri>8)
  {
    x=fri-8;
    y=x*15+(x*100);
    w6=y+800;
  }
  td=mon+tue+wed+thu+fri;
  if(td>40)
  {
    ed=td-40;
    w8=(ed*25)+(ed*100);
  }
  tr=w1+w2+w3+w4+w5+w6+w7+w8;
  cout<<tr;
}