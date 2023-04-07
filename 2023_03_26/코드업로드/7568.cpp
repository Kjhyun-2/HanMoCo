#include <cstdio>
int main()
{
	int a,i,j;
	int sv[500],n=1;
	int kg[500],cm[500];
	scanf("%d",&a);
	for(i=0;i<a;i++)
	{
		scanf("%d %d",&kg[i],&cm[i]);
	}
	for(i=0;i<a;i++)
	{
		for(j=0;j<a;j++)
		{
			if(kg[i]<kg[j] && cm[i]<cm[j])
			{
				n++;
			}
		}
		sv[i] = n;
		n=1;
	}
	for(i=0;i<a;i++)
	{
		printf("%d ",sv[i]);
	}
	return 0;
}
