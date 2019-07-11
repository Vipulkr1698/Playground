#include <stdio.h>
int main(){
	// Type your code here
  	int cur_row,cur_col,n;
  	scanf("%d",&n);
  	for(cur_row=1;cur_row<=n;cur_row++)
    {
      for(cur_col=1;cur_col<=n;cur_col++)
      {
       printf("%d",cur_row);
      }
      printf("\n");
    }
  	return 0;
}