#include <iostream>
using namespace std;
int main()
{
	int a,i,j;
	cin >> a;
	for(; ;)
	{
		if(a>=4)
		{
			cout << "long" << " ";
		}
		if(a==0)
		{
			cout << "int";
			break;
		}
		a = a-4;
	}
	return 0;
}
	
