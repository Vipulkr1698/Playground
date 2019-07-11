#include <stdio.h>
int main() 
{
    //write your logic here
  	int size,i,j,del_index=100;
  	scanf("%d",&size);
  	int arr[size];
  	for(i=0;i<size;i++)
    {
      scanf("%d",&arr[i]);
    }
  	for(i=0;i<size;i++)
    {
      for(j=i+1;j<size;j++)
      {
        if(arr[i]==arr[j])
        {
          del_index = j;
         //printf("%d",del_index);
        }
      }
    }
  	for(i=0;i<size;i++)
    {
      if(i!=del_index)
      {
        printf("%d ",arr[i]);
      }
    }
	return 0;
}
