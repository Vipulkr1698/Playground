#include <stdio.h>
int main(){
	// Type your code here
  	int cur_row,cur_col,n,num=0;
  	scanf("%d",&n);
  	for(cur_row=1;cur_row<=n;cur_row++)
    {
      for(cur_col=1;cur_col<=cur_row;cur_col++)
      {
        num = num + 1;
        if(num%2==0)
          printf("#");
        else
           printf("*");
      }
      printf("\n");
    }
  	return 0;
}