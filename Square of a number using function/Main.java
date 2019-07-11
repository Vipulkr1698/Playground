#include<stdio.h>
int squareno(int n)
{
  return n*n;
}
int main() {
   // Type your code here
  int x,sq;
  scanf("%d",&x);
  sq=squareno(x);
  printf("%d",sq);
   return 0;
}