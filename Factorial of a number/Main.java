#include<iostream>
int fact(int n);
int main()
{
	int n;
  	std::cin>>n;
  	std::cout<<fact(n);
}
int fact(int n)
{
  if(n<=1)
    return 1;
  else
    return n*fact(n-1);
}