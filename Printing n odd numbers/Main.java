#include <stdio.h>
int main() {
	//Type your code
	int n,i;
  	int count=0;
  	scanf("%d",&n);
  	for(i = 0;count<n;i++)
    {
      if(i%2==1)
      {
        count = count + 1;
        printf("%d\n",i);
      }
    }
	return 0;
}