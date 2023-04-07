#include <iostream>
using namespace std;
long long int dy[1500][1500]={0,};
int main()
{
	int a,b,i,j;
	cin >> a >> b;
	dy[0][0] = 1;
	int x = a, y = b;
	for(i=1;i<=a;i++)
	{
		for(j=1;j<=b;j++)
		{
			dy[i][j] = (dy[i-1][j] + dy[i][j-1] + dy[i-1][j-1])%1000000007;
		}
	}
	cout << dy[x][y];
	return 0;
}
	
