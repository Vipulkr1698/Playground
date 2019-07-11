#include<stdio.h>
int main()
{
  //Type your code here
  int n,i;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int arr_zer[n],zero_count=0;
  int new[n],new_count=0;
  for(i=0;i<n;i++)
  {
    if(arr[i]==0)
    {
      arr_zer[zero_count]=0;
      zero_count++;
    }
    else
    {
      new[new_count]=arr[i];
      new_count++;
    }
  }
  for(i=0;i<new_count;i++)
  { 
    arr[i]=new[i];
  }
  for(i=new_count;i<n;i++)
  {
    arr[i]=0;
  }
  for(i=0;i<n;i++)
  {
    printf("%d ",arr[i]);
  }
  return 0;
}