#include<iostream>
int main()
{
    int r,c,m1[10][10],m2[10][10],i,j;
  	std::cin>>r>>c;
  	for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        std::cin>>m1[i][j];
      }
    }
     for(i=0;i<r;i++)
     {
      for(j=0;j<c;j++)
      {
        std::cin>>m2[i][j];
      }
     }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        std::cout<<m1[i][j]+m2[i][j]<<" ";
      }
      std::cout<<"\n";
    }
}
