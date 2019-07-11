#include<stdio.h>
int main()
{
  //Type your code here
  int n1,n2;
  scanf("%d \n%d",&n1,&n2);
  if(n1>n2)
  {
    printf("num1 is the greatest");
  }
  else if(n2>n1)
  {
    printf("num2 is the greatest");
  }
  else
  {
    printf("Both number equal");
  }
    
  return 0;
}