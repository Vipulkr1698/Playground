#include<stdio.h>
int main()
{
  //Type your code here
  int x;
  scanf("%d",&x);
  int firstDigit = x/100;
  int lastDigit = x%10;
  int sum = firstDigit + lastDigit;
  printf("%d",sum);
  return 0;
}