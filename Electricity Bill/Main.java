#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  if(n<=200)
    cout<<"Rs."<<n/2;
  else if(n<=400)
    cout<<"Rs."<<(n*.65)+100;
  else if(n<=600)
    cout<<"Rs."<<(n*.80)+200;
  else if(n>600)
    cout<<"Rs."<<(n*1.25)+425;
}