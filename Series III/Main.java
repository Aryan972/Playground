#include<iostream>
main()
{
	int n,i,x,y;
  	std::cin>>n;
  	x=6;
  	y=5;
  	for(i=1;i<=n;i++)
    {
      std::cout<<x<<" ";
      x=x+y;
      y=y+5;
    }
}
  