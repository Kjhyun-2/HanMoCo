#include <iostream>
using namespace std;
void hanoi(int x,int left,int mid,int right);
int n=1; //�ű�� Ƚ�� ������ ���� �ϳ����Լ��� ���� ���Ƿ� ��������
int main()
{
   int a,i,j;
   cin >> a;
   hanoi(a,1,2,3);
   cout << n;
   return 0;
}
//x=�ڽź��� ���� ������ ���� left=�̵������� mid=���δ��ڸ� right=������������ 
void hanoi(int x,int left,int mid,int right)
{
   int i,j;
   if(x==1) //������ �ϳ��϶� 1��°�� �ִ� ������ 3��°�ִ°����� 
   {
      cout << left << " " << right << "\n";
      return; //���̻� �Լ� ȣ���� �ʿ� ������ return 
   }
   n++;
   hanoi(x-1,left,right,mid); //1�� 2�� �� 
   cout << left << " " << right << "\n";
   //hanoi(x-1,left,mid,right); //1�� 3���� ���°� ȣ�� ��ó�� left right ��� 
   n++;
   hanoi(x-1,mid,left,right);//2�� 3���� �� 
}
