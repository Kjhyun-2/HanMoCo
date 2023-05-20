#include <iostream>
using namespace std;
int main()
{
	int hol[7];
	int i,j,min=100;
	int hap=0;
	bool sw=false;
	for(i=0;i<7;i++)
	{
		cin >> hol[i];
		if(hol[i]%2!=0)
		{ 
			sw = true;
			if(min>hol[i])
				min = hol[i];
			hap+=hol[i];
		}
	}
	if(sw==false)
		cout << "-1";
	else
		cout << hap << "\n" << min;
	return 0;
}
	
