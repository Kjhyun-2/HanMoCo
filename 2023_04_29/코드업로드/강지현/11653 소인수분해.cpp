#include <iostream>
using namespace std;
int main()
{
	int a,i,j;
	cin >> a;
	if(a==1)
	{
		return 0;
	}
	for(i=2;i<=a;)
	{
		if(a%i==0)
		{
			cout << i << "\n";
			a = a/i;
		}
		else
		{
			i++;
		}
	}
	return 0;
}
