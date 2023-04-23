#include <iostream>
#include <set>
using namespace std;
int main()
{
	string a;
	string b;
	int k;
	int i,j;
	cin >> a;
	set<string> set;
	k = a.length();
	for(i=0;i<k;i++)
	{
		for(j=i;j<k;j++)
		{
			b+=a[j];
			set.insert(b);
		}
		b = "";
	}
	cout << set.size();
	return 0;
}
