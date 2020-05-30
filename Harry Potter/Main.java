#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,x;

	std::cin>>n;

	x=n % 10 + n / 1000;

	std::cout<<x;
}