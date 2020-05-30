#include<iostream>
using namespace std;
main()
{
	int a,b,c;
  	cin>>a>>b;
  	cout<<"Enter first number : Enter second number : Menu\n";
  	cout<<"1.Addition\n"<<"2.Subtraction\n"<<"3.Multiplication\n"<<"4.Division\n"<<"5.Remainder\n";
  	cin>>c;
  	switch(c)
    {
      case 1:cout<<a+b;
        	 	break;
      case 2:cout<<a-b;
        		break;
      case 3:cout<<a*b;
        		break;
      case 4:cout<<a/b;
        		break;
      case 5:cout<<a%b;
        		break;
      default:cout<<"Invalid operation";
        		break;
    }
}