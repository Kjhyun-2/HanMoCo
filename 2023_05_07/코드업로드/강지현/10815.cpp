#include <iostream>
#include <algorithm>
using namespace std;
int b[500010]={0,};
int main()
{
	int a,i,j;
	int c,d;
	int L,R,M;
	scanf("%d",&a);
	for(i=0;i<a;i++)
	{
		scanf("%d",&b[i]);
	}
	std::sort(b,b+a);
	scanf("%d",&c);
	for(i=0;i<c;i++)
	{
		scanf("%d",&d);
		L = 0;
		R = a-1;
		do{
			M = (L+R)/2;
			if(d < b[M])
			{
				R = M-1;
			}
			else if(d==b[M])
			{
				cout << 1 << " ";
				break;
			}
			else
			{
				L = M+1;
			}
			if(L>R)
			{
				cout << 0 << " ";
				break;
			}
		}while(1);
	}
	return 0;
}		
