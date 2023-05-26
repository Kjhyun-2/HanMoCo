#include <iostream>
using namespace std;
int main()
{
	long long int a,i,j;
	long long int jumsu,P;
	long long int b[55];
	long long int dap=1;
	cin >> a >> jumsu >> P;
	if(a==0)
	{
		cout << 1;
		return 0;
	}
	for(i=0;i<a;i++)
	{
		cin >> b[i];
		if(b[i]>jumsu)
			dap++;
	}
	if(dap>P || (b[a-1]>=jumsu&&a==P))
		cout << -1;
	
	else
		cout << dap;

	return 0;
}
	
