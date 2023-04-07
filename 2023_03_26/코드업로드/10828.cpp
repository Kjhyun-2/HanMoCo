#include <iostream>
#include <string.h>
#include <stack>
using namespace std;
int main()
{
	int a,i,j;
	int x;
	string c;
	cin >> a;
	std::stack<int> st;
	for(i=0;i<a;i++)
	{
		cin >> c;
		if(c=="push")
		{
			cin >> x;
			st.push(x);
		}
		else if(c=="top")
		{
			if(st.empty())
			{
				cout << "-1\n";
			}
			else
			{
				cout << st.top() << "\n";
			}
		}
		else if(c=="size")
		{
			cout << st.size() << "\n";
		}
		else if(c=="pop")
		{
			if(st.empty())
			{
				cout << "-1\n";
			}
			else
			{
				cout << st.top() << "\n";
				st.pop();
			}
		}
		else if(c=="empty")
		{
			if(st.empty())
			{
				cout << "1\n";
			}
			else
			{
				cout << "0\n";
			}
		}
	}
	return 0;
}
			
		
