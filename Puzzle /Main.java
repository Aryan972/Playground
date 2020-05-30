#include<iostream>
int main()
{
   	int i,j,r,c,m[10][10];
  	std::cin>>r>>c;
  	for(i=1;i<=r;i++)
		for(j=1;j<=c;j++)
          std::cin>>m[i][j];
  	for(i=1;i<=c;i++)
    {
      for(j=1;j<=r;j++)
      {
        std::cout<<m[j][i]<<" ";
      }
        std::cout<<"\n";

    }
}