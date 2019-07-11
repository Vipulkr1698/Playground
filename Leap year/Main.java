#include<stdio.h>
int main()
{
  //Type your code here
  int year;
  scanf("%d",&year);
   if(year%4 == 0)
    {
        if( year%100 == 0)
        {
            if ( year%400 == 0)
                printf("Leap year.");
            else
                printf("Not Leap year", year);
        }
        else
            printf("Leap year" );
    }
    else
        printf("Not Leap year", year);
  return 0;
}