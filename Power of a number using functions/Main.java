#include<stdio.h>
int powerfind(int b,int e)
{
  int pow = 1;
  while(e!=0)
  {
    pow=pow*b;
    e--;
  }
return pow;
}
int main(){
    // Type your code here
  int x,y;
  scanf("%d",&x);
  scanf("%d",&y);
  printf("%d",powerfind(x,y));
  return 0;
}