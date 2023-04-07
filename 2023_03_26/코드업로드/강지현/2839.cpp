#include <iostream>
using namespace std;
int main()
{
	int a,n=0;
	cin >> a;
	while(a>0)
	{
		if(a%5==0)
		{
			n += a/5;
			break;
		}
		else
		{
			a-=3;
			n++;
		}
	}
	if(a<0)
	{
		cout << "-1";
	}
	else
	{
		cout << n;
	}
	return 0;
}
	
		
		
