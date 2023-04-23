#include <iostream>
using namespace std;
int main()
{
	int a,b,i,j,h;
	int array[320][320]={0,};
	int c;
	int x,y,q,w;
	int result = 0;
	cin >> a >> b;
	for(i=1;i<=a;i++)
	{
		for(j=1;j<=b;j++)
		{
			cin >> array[i][j];
		}
	}
	cin >> c;
	for(i=0;i<c;i++)
	{
		cin >> x >> y >> q >> w;
		
		for(j=x;j<=q;j++)
		{
			for(h=y;h<=w;h++)
			{
				result += array[j][h];
			}
		}	
		cout << result << "\n";
		result = 0;
	}
	return 0;
}
		
		
