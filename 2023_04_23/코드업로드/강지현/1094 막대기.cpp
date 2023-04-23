#include <iostream>
using namespace std;
int main()
{
	int a,i,j;
	int n=0;
	int b = 64;
	cin >> a;
	for(; ;)
	{
		if(b>a){
			b = b/2;
		}
		else{
			a = a-b;
			n++;
			if(a==0) 
				break;
		}
	}
	cout << n;
	return 0;
}
