#include<iostream>
main()
{
	int n,res,temp,sum;
  	std::cin>>n;
  	temp=n;
  	while(temp)
    {
      	sum+=temp%10;
      	temp=temp/10;
    }
  	res=n%sum;
  	if(res==0)
      std::cout<<"Harshad Number";
  	else
      std::cout<<"Not Harshad Number";
}