#include <iostream>
#include <string.h>
using namespace std;
int main()
{
	string a;
	int i,n=0;
	cin >> a;
	for(i=0;i<a.length();i++)
	{
		if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
		{
			n++;
		}
	}
	cout << n;
	return 0;
}
