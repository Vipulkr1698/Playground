#include <stdio.h>
int main() {
	//Type your code
  int n,k;
  int sum=0;
  scanf("%d",&n);
    while(n>0)
    {
      k=n%10;
      sum=sum+k;
      n=n/10;   
    }
  printf("%d",sum);
	return 0;
}