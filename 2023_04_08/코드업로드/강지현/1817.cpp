#include <iostream>
using namespace std;
int main()
{
	int a,b,i,j;
	int sv[500]={0,};
	int check[500]={0,};
	int hap=0,n=1,t=0;
	cin >> a >> b;	
	if(a==0)
	{
		cout << 0;
		return 0;
	}
	for(i=0;i<a;i++)
	{
		cin >> sv[i];
	}
	for(i=0;i<a;i++)
	{	
		for(j=t;j<a;j++)
		{
			if(hap+sv[j]<=b && check[t]==0)
			{
				check[t]=1;
				hap+=sv[j];
				t++;	
			}
			else
			{	
				hap=0;
				break;
			}
		}
		for(j=0;j<a;j++)
		{
			if(check[j]==0)
			{
				n++;
				break;
			}
		}
	}
	cout << n;
				
				
	return 0;
}
	
