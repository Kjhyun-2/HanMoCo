#include <iostream>
using namespace std;
int main()
{
	int a,i,j;
	int x[30],y[30];
	long long int xpact=1,ypact=1,minuspact=1;
	cin >> a;
	for(i=0;i<a;i++)
	{
		cin >> x[i] >> y[i];
		for(j=x[i];j>=1;j--)
			xpact = xpact*j;
		for(j=(y[i]-x[i]);j>=1;j--)
			minuspact = minuspact*j;
		for(j=y[i];j>=1;j--)
			ypact = ypact*j;
		cout << xpact << " " << ypact << "\n";
		cout << ypact/(minuspact*xpact) << "\n";
		xpact=1; ypact=1; minuspact=1;
	}
	return 0;
}
