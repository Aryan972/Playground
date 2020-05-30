#include<iostream>
using namespace std;
main()
{
  int x,y,z;
  std::cin>>x>>y>>z;
  if(x<=((y*75)+(z*30)))
     std::cout<<"Boat will drow";
  else
     std::cout<<"Boat is stable";
     
}