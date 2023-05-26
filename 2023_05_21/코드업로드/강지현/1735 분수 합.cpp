#include <iostream>
using namespace std;
int main()
{
	int xBunJa,xBunMo;
	int yBunJa,yBunMo;
	int rBunJa,rBunMo;
	int i,j,k,choidae;
	cin >> xBunJa >> xBunMo;
	cin >> yBunJa >> yBunMo;
	rBunMo = xBunMo * yBunMo;
	rBunJa = (xBunJa*yBunMo)+(xBunMo*yBunJa);
	int saverBunMo = rBunMo;
	int saverBunJa = rBunJa;
  	while(true)
	{
		rBunMo=rBunMo%rBunJa;
		k=rBunMo;
		rBunMo=rBunJa;
		rBunJa=k;
		if(rBunJa==0)
		{
			choidae = rBunMo;
			break;
		}
    }
    cout << saverBunJa/choidae << " " <<saverBunMo/choidae;
    return 0;
}
