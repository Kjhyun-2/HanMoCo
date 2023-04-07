#include <cstdio>
int b[2500]={0,};
int sv[2500]={0,};
int main()
{
	int a,i,j,n=0;
	int c;
	int sung,sw=0;
	int swn,x=0,y=0;
	scanf("%d",&a);
	for(i=1;i<=a;i++)
	{
		scanf("%d",&b[i]);
		sv[i] = b[i];
	}
	scanf("%d",&c);
	for(i=1;i<=c;i++)
	{
		scanf("%d %d",&sung,&swn);
		if(sung==1)
		{
			for(j=swn;j<=a;j++)
			{
				if(j%swn==0 && sv[j]==0)
				{
					sv[j] = 1;
				}
				else if(j%swn==0 && sv[j]==1)
				{
					sv[j] = 0;
				}
			}
		}
		if(sung==2)
		{
			for(j=1;j<=a;j++)
			{
				if(sv[swn-j]==sv[swn+j] && swn-j>=1 && swn+j<=a)
				{
					sw=1;
					x = swn-j;
					y = swn+j;
				}
				else
				{
					break;
				}
			}
			if(sw==1)
			{
				for(j=x;j<=y;j++)
				{
					if(sv[j]==0)
					{
						sv[j] = 1;
					}
					else if(sv[j]==1)
					{
						sv[j] = 0;
					}
				}
			}
			else if(sw==0)
			{
				if(sv[swn]==0)
				{
					sv[swn] = 1;
				}
				else
				{
					sv[swn] = 0;
				}
			}
			sw=0;
		}
	}
	for(i=1;i<=a;i++)
	{
		printf("%d ",sv[i]);
		n++;
		if(n==20)
		{
			printf("\n");
			n=0;
		}
	}
	return 0;
}
