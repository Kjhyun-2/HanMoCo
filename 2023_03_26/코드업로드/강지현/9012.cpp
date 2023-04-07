#include <stdio.h>
#include <string.h>
#include <stack>
int main()
{
	int a,t;
	int i,j;
	bool check = false;
	char c[55];
	scanf("%d",&a);
	for(i=0;i<a;i++)
	{
		scanf("%s",c);
		t = strlen(c);
		std::stack<char> st;
		
		for(j=0;j<t;j++)
		{
			
			if(c[j]=='(')
			{
				st.push('(');
			}
			else if(c[j]==')')
			{
				if(st.empty())
				{
					printf("NO\n");
					check = true;
					break;
				}
				else
				{
					st.pop();
				}
			}
		}
		if(check== false && st.empty())
		{
			printf("YES\n");
		}
		else if(!st.empty())
		{
			printf("NO\n");
		}
		
		check = false;
	}

		
		
	return 0;
}
	
		
