#include<iostream>
using namespace std;
int rec(int n,int count);
int main()
{
  int n,count;
  cin>>n;
  rec(n,count);
}
int rec(int n,int count)
{
  
  cout<<n<<"\n";
  if(n>1)
  {
  	if(n%2==0)
    {
    	return rec(n/2,++count);
    }
  	else
    {
    	return rec(3*n+1,++count);
    }
	}
  cout<<count;
}