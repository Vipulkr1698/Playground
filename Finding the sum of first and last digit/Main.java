#include <stdio.h>
int main() {
	//Type your code
  int n,k,firstDigit,lastDigit;
  scanf("%d",&n);
  k=n;
  while(k>=10)
  {
    k=k/10;
  }
  firstDigit = k;
  lastDigit = n%10;
  printf("%d",firstDigit+lastDigit);
	return 0;
}