#include <iostream>
#include <algorithm>
using namespace std;
int hap[1050]={0,};
int check[1050]={0,};
bool sw[1050] = {false,};
int main()
{
	int a,i,j;
	int x,y;
	cin >> a;
	for(i=0;i<a;i++)
	{
		cin >> x >> y;
		hap[i] = (x*x)+(y*y);
		check[i] = hap[i];
	}
	std::sort(hap,hap+a,greater<int>());
	for(i=0;i<a;i++)
	{
		for(j=0;j<a;j++)
		{
			if(hap[i]==check[j] && sw[j]==false)
			{
				cout << j+1 << "\n";
				sw[j] = true;
				break;
			}
		}
	}	
	return 0;
}
