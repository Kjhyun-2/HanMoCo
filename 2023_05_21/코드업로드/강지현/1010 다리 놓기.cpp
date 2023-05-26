#include<iostream>
using namespace std;
int main()
{
	int a,i,j,n,r,dap;
	cin >> a;
	for(i=0;i<a;i++)
	{
		dap=1;
		cin >> r >> n;
		for(j=0;j<r;j++)
		{
			dap*=n-j; 
			dap/=1+j;
		}
		cout << dap << "\n";
	}
	return 0;
}
