#include<iostream>
using namespace std;
int main()
{
	int i,n,x=121,y=104;
  	std::cin>>n;
  	for(i=1;i<=n;i++)
    {
      std::cout<<x<<" ";
      x=x+y;
      y=y+32;
    }
}