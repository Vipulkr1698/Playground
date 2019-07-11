#include<stdio.h>
int main()
{
  //fill the code
  int arr[5] ,size,i;
  scanf("%d",&size);
  for(i=0;i<size;i++)
  {
    scanf("%d",&arr[i]);
  }
  int max = arr[0];
  for(i=1;i<size;i++)
  {
  if(arr[i]>max)
  {
    max = arr[i];
  }
  }
  printf("%d",max);
  return 0;
}