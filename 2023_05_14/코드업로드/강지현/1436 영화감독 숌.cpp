#include <iostream>
#include <string>
using namespace std;
int main()
{
	int a, i, j;
	int n = 0;
	string b;
	cin >> a;
	for (i = 665; ; i++)
	{
		b = to_string(i);
		for (j = 0; j < b.length() - 2; j++)
		{
			if (b[j] == '6' && b[j + 1] == '6' && b[j + 2] == '6')
			{
				n++;
				if (n == a)
				{
					cout << i;
					return 0;
				}
				break;
			}
		}
	}
	return 0;
}
