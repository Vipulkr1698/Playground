#include <stdio.h>
int main() {
	//Type your code
	int n,i;
  	scanf("%d",&n);
  	for(i = 0;i<=n;i++)
    {
      if(i%2==1)
        printf("%d\n",i);
    }
	return 0;
}