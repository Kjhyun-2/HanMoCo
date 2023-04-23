#include <iostream>
#include <math.h>
using namespace std;
int main()
{
	int a,i,j;
	int x,y,t;
	int dis,n=0,sv;
	cin >> a;
	for(i=0;i<a;i++)
	{
		cin >> x >> y;
		t = y-x; // 이동 해야할 거리 
		dis = (int)sqrt(t); // 최대 갈수 있는 거리  
		sv = dis*dis; //  
		n = 2*dis-1; // 짝수번 dis *2 홀수번 dis *2 -1 최소이동  
		if(t-sv<=dis && t-sv!=0)
		{
			n++;
		}
		else if(t-sv>dis && t-sv!=0)
		{
			n+=2;
		}
		cout << n << "\n";
	}
	return 0;
}
