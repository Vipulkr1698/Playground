#include<stdio.h>
int sum_natural(int n)
{
  int sum;
  for(int i=1;i<=n;i++)
  {
    sum=sum+i;
  }
  return sum;
}
int main() {
    // Type your code here
  	int n,sum;
  	scanf("%d",&n);
  	sum=sum_natural(n);
  	printf("%d",sum);
  	return 0;
}