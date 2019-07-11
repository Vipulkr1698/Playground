#include<stdio.h>
int main()
{
  //Type your code here
  int arr[5],size;
  scanf("%d",&size);
  for(int i = 0 ; i < size ; i++)
  {
    scanf("%d",&arr[i]);
  }
  int n1,n2;
  int index1 = -1;
  int index2 = -1;
  int flag1 = 0;
  int flag2 = 0;
  scanf("%d",&n1);
  scanf("%d",&n2);
  for(int i = 0 ; i < size ; i++)
  {
    if(n1==arr[i])
    {
      flag1 = 1;
      index1 = i;
    }
    
  }
   for(int i = 0 ; i < size ; i++)
   {
   if(n2==arr[i])
    {
      flag2 = 1;
      index2 = i;
    }
   }
     
  if(flag1 == 1)
  {
    printf("%d\n",index1);
  }
  if(flag2 == 1)
  {
    printf("%d",index2);
  }
  else 
  {
    printf("-1");
  }
  return 0;
}