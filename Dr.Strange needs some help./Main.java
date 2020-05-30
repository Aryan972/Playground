#include<iostream>
#include<math.h>
main()
{
	int m,n,req,x;
  	std::cin>>m>>n>>req;
  	x=pow(m,n);
  	if(req<=x)
      std::cout<<"Doctor, you can proceed with your experiment.";
  	else
      std::cout<<"Sorry Doctor! You need more bacteria.";
}