#include <iostream>
#include <algorithm>
using namespace std;
char check[1050][1050];
char save[1050][1050];
int main()
{
	string a;
	int i,j,k,t=0;
	cin >> a;
	k = a.length();
	for(i=0;i<k;i++)
	{
		for(j=i;j<k;j++)
		{
			check[i][t] = a[j];
			t++;
		}
		t=0;
	}
	for(i=0;i<k-1;i++)
	{
		for(j=i+1;j<k;j++)
		{
			t = 0;
			for(; ;)
			{
				if(check[i][t] == check[j][t])
				{
					t++;
				}
				else if(check[i][t] > check[j][t])
				{
					for(int h=0;h<k;h++)
					{
						save[i][h] = check[i][h];
						check[i][h] = check[j][h];
						check[j][h] = save[i][h];
					}
					break;
				}
				else
				{
					break;
				}
			}
		}
	}
	for(i=0;i<k;i++)
	{
		for(j=0;j<k;j++)
		{
			if(check[i][j]!='\0')
			{
				cout << check[i][j];
			}
		}
		cout << "\n";
	}
	
	
	return 0;
}
