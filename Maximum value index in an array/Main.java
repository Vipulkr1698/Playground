// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int maxIndex(int arr[],int n)
{
  int max,index;
  max=arr[0];
  index = 0;
  for(int i=1;i<n;i++)
  {
    if(arr[i]>max)
    {
      max = arr[i];
      index = i;
    }
   
  }
  return index;
}
int main()
{
  // Type your code here 
   int n;
   scanf("%d",&n);
   int arr[n];
   for(int i=0;i<n;i++)
   {
     scanf("%d",&arr[i]);
   }
   printf("%d",maxIndex(arr,n));
   return 0;
}