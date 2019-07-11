#include<stdio.h>
int main()
{	
	int n;
    scanf("%d",&n);
	for(int starcount = 1 ; starcount <= n ; starcount++) 
        {
		   printf("%d",starcount);
		   if((starcount % 3 == 0) && (starcount != n))
    		   printf(",");			
		}
     return 0;
}