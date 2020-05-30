#include<iostream>
int main()
{
  int i,n,y,a[10],f=0;
  std::cin>>n;
  for(i=1;i<=n;i++)
	std::cin>>a[i];
  std::cin>>y;
  for(i=1;i<=n;i++)
    if(a[i]==y)
    {
      f=1;
      break;
    }
  if(f==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}