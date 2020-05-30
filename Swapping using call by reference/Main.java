#include<iostream>
using namespace std;
int swap(int &a,int &b)
{
  a=a+b;
  b=a-b;
  a=a-b;
}
main()
{
	int x,y;
  	cin>>x>>y;
  	cout<<"Before swapping a= "<<x<<" and b="<<y<<endl;
  	swap(x,y);
  	cout<<"After swapping a= "<<x<<" and b="<<y;
}