#include<iostream>
int fact(int n)
{
  if(n<2)
    return 1;
  else
    return n*fact(n-1);
}
int main()
{
  int n;
  std::cin>>n;
  std::cout<<"The factorial of "<<n<<" is "<<fact(n);
}