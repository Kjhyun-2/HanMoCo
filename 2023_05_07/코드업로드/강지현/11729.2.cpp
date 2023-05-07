#include <iostream>
using namespace std;
void hanoi(int x,int left,int mid,int right);
int n=1; //옮기는 횟수 저장할 변수 하노이함수와 같이 쓰므로 전역변수  
int savex[1048580]={0,};  //이동시작하는 위치  배열로 저장 
int savey[1048580]={0,}; //이동할위치 배열로 저장 
int t=0; //저장할 배열의 인덱스
int main()
{
   int a,i,j;
   cin >> a;
   hanoi(a,1,2,3);
   cout << n << "\n";
   for(i=0;i<t;i++)
   {
      cout << savex[i] << " " << savey[i] << "\n";
   }
   return 0;
}
//x=자신보다 작은 원판의 갯수 left=이동시작점 mid=잠깐두는자리 right=최종도착지점 
void hanoi(int x,int left,int mid,int right)
{
   int i,j;
   if(x==1) //원판이 하나일때 1번째에 있는 원판이 3번째있는곳으로 
   {
      savex[t] = left;
      savey[t] = right;
      t++;
      //cout << left << " " << right << "\n";
      return; //더이상 함수 호출할 필요 없으니 return 
   }
   n++;
   hanoi(x-1,left,right,mid); //1이 2로 감 
   savex[t] = left;
   savey[t] = right;
   t++;
   //cout << left << " " << right << "\n";
   //hanoi(x-1,left,mid,right); //1이 3으로 가는건 호출x 어처피 left right 출력 
   n++;
   hanoi(x-1,mid,left,right);//2가 3으로 감 
}
