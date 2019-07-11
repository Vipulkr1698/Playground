#include <stdio.h>
int main() 
{
	//write your code here
  	int size1,size2,i,j;
  	scanf("%d",&size1);
  	scanf("%d",&size2);
  	int arr1[size1];
  	int arr2[size2];
  	int new_arr[size1+size2];
  	for(i=0;i<size1;i++)
    {
      scanf("%d",&arr1[i]);
    }
    for(i=0;i<size2;i++)
    {
      scanf("%d",&arr2[i]);
    }
  	for(i=0;i<size1;i++)
    {
      new_arr[i]=arr1[i];
    }
     i=size1;
      for(j=0;j<size2;j++)
      {
      new_arr[i]=arr2[j];
        i++;
      }
    

  
  	
  	 for(i=0;i<size1+size2;i++)
     {
       
       for(j=i+1;j<size1+size2;j++)
       {
         if(new_arr[i]>new_arr[j])
         {
           int temp = new_arr[i];
           new_arr[i]=new_arr[j];
          new_arr[j]=temp;
         }
       }
     }
   for(i=0;i<size1+size2;i++)
    {
      printf("%d ",new_arr[i]);
    }
  
	return 0;
}
