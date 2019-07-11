#include <stdio.h>
int main() {
	//Type your code
  	int num,i,factorial=1;
  	scanf("%d",&num);
  	for(i=num;i>0;i--)
    {
      factorial = factorial * i; 
    }
  printf("%d",factorial);
	return 0;
}