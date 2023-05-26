#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
	int buy,brend,i,j;
	int package[110];
	int nat[110];
	int dap=0;
	cin >> buy >> brend;
	for(i=0;i<brend;i++)
	{
		cin >> package[i] >> nat[i];
	}
	std::sort(package,package+brend);
	std::sort(nat,nat+brend);
	int minpackage = package[0];
	int minnat = nat[0];
	while(true)
	{
		if(buy<=0)
			break;
		if(minpackage < buy*minnat && minpackage < minnat*6)
		{
			buy-=6;
			dap += minpackage;
		}
		else
		{
			buy--;
			dap += minnat;
		}
	}
	cout << dap;
	return 0;
}
