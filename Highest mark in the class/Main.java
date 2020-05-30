#include<iostream>
int main()
{
  int n,a[100],i,temp=0;
  std::cin>>n;
  for(i=1;i<=n;i++)
    std::cin>>a[i];
  temp=a[0];
  for(i=1;i<=n;i++)
  {
    if(a[i]>temp)
      temp=a[i];
  }
  std::cout<<temp;
}