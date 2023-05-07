#include <iostream>
#include <string.h>
#include <algorithm>
using namespace std;
string hear[500010];
string see[500010];
string dap[500010];
int main()
{
	int a,b,i,j;
	int t=0;
	cin >> a >> b;
	for(i=0;i<a;i++)
	{
		cin >> hear[i];
	}
	for(i=0;i<b;i++)
	{
		cin >> see[i];
	}
	for(i=0;i<a;i++)
	{
		for(j=0;j<b;j++)
		{
			if(hear[i]==see[j])
			{
				dap[t] = hear[i];
				t++;
			}
		}
	}
	cout << t << "\n";
	std::sort(dap,dap+t);
	for(i=0;i<t;i++)
	{
		cout << dap[i] << "\n";
	}	
	return 0;
}
		
		
