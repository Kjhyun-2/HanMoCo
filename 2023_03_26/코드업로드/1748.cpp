#include <stdio.h>
int main()
{
	long long int i,j;
	long long int a,n=1,t=1;
	long long int dap = 0;
    scanf("%lldd",&a);
    for(i=1;i<=a;i++)
    {
        if(i==t*10)
        {
        	t = t *10;
        	n++;
        }
        dap+=n;
    }
    printf("%lld",dap);

    return 0;
}
