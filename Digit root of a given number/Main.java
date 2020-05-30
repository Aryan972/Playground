#include<iostream>
using namespace std;
main()
{
	int n,x,y;
  	cin>>n;
  	while(n>9)
    {
		x=n%10;
      	n=n/10;
      	n=x+n;
    }
  	cout<<n;
}