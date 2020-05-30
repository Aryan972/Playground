#include<iostream>
main()
{
  	int n,i;
  	float x=0.5;
	std::cin>>n;
	for(i=1;i<=n;i++)
    {
  		std::cout<<x<<" ";
      	x=3*x;
    }
}