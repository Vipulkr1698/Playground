#include<stdio.h>
int main()
{
  //Type your code here
  int x;
  scanf("%d",&x);
  int secondLastDigit = (x/10)%10;
  printf("%d",secondLastDigit);
  return 0;
}