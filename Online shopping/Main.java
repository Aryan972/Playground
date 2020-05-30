#include<iostream>
using namespace std;
int main()
{
  int a1,a2,a3,a4,a5,a6,a7,a8,a9;
  cin>>a1>>a2>>a3>>a4>>a5>>a6>>a7>>a8>>a9;
  int x=a1-((a1*a2)/100)+a3;
  int y=a4-((a4*a5)/100)+a6;
  int z=a7-((a7*a8)/100)+a9;
  cout<<"In Flipkart Rs."<<x<<"\n";
  cout<<"In Snapdeal Rs."<<y<<"\n";
  cout<<"In Amazon Rs."<<z<<"\n";
  if(x <= y && x <= z)
    cout<<"He will prefer Flipkart";
  else if(y < x && y < z)
    cout<<"He will prefer Snapdeal";
  else if(z < x && z < y)
    cout<<"He will prefer Amazon";
}