#include <iostream>
using namespace std;
int main()
{
	int a,b,i,j;
	int c[50]={0,};
	int max=0;
	int n=0;
	cin >> a >> b;
	for(i=1;i<=a;i++)
	{
		cin >> c[i];
	}
	do{ 
		for(i=a;i>=1;i--)
		{
			if(c[i] <= b && max < c[i])
			{
				max = c[i];
			}
		}
		b = b - max;
		n++;
		max = 0;
		if(b==0)
		{
			break;
		}
	}while(1);
	cout << n;
	return 0;
}
