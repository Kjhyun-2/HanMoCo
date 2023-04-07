#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
pair<pair<string,int>,pair<int,int> > dap[500];
bool cmp(pair<pair<string,int>,pair<int,int> > x, pair<pair<string,int>,pair<int,int> > y)
{
    if (x.second.second != y.second.second) 
		return x.second.second > y.second.second;
    else if(x.second.first != y.second.first)
		return x.second.first > y.second.first;
	else if(x.first.second != y.first.second)
		return x.first.second > y.first.second;
}
int main()
{
	int a,i;
	cin >> a;
	for(i=0;i<a;i++)
	{
		cin >> dap[i].first.first >> dap[i].first.second >> dap[i].second.first >> dap[i].second.second;
	}
	std::sort(dap,dap+a,cmp);
	cout << dap[0].first.first << "\n" << dap[a-1].first.first;
	
	return 0;
}
	
	
