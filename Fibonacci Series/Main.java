#include<iostream>
int fib(int k)
{
	if(k<2)
      return k;
  	else
      return (fib(k-1)+fib(k-2));
}
int main()
{
  int value;
  std::cin>>value;
  std::cout<<"The term "<<value<<" in the fibonacci series is "<<fib(value-1);

}