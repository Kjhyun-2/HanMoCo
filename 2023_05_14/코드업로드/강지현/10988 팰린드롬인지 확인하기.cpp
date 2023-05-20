#include <iostream>
#include <string.h>
using namespace std;
int main()
{
	string a;
	int i,j,check=0;
	cin >> a;
	int t=0;
	int x = a.length();
	int y = x;
	for(; ;)
	{
		if(a[t]!=a[x-1])
		{
			cout << "0";
			return 0;
		}
		t++;
		x--;
		if(t>=y || x<=0)
		{
			break;
		}
	}
	cout << "1";
	return 0;
}
		
			
