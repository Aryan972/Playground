#include<iostream>
main()
{
  	int n,x=121,y=104,i;
  	std::cin>>n;
  	for(i=1;i<=n;i++)
    {
      	std::cout<<x<<" ";
      	x=x+y;
      	y=y+32;
    }
}