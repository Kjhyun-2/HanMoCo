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
		t = y-x; // �̵� �ؾ��� �Ÿ� 
		dis = (int)sqrt(t); // �ִ� ���� �ִ� �Ÿ�  
		sv = dis*dis; //  
		n = 2*dis-1; // ¦���� dis *2 Ȧ���� dis *2 -1 �ּ��̵�  
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
