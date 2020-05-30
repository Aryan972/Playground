#include <iostream>
main()
{
	int n,rem,rev;
  	std::cin>>n;
  	while(n>0)
    {
      rem=n%10;
      rev=rem;
      n=n/10;
      std::cout<<rev;
    }
}
