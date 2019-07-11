/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int sum(int arr[],int start,int end)
{
  int sum = 0;
  for(int i=start;i<end;i++)
  {
    sum+=arr[i];
  }
  return sum;
}
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
  scanf("%d",&arr[i]);
  }
  int b1,b2;
  b1 = sum(arr,0,3);
  b2 = sum(arr,3,n);
  if(b1==b2)
  {
  printf("Perfect Batch");
  }
  else
  {
  printf("Not a Perfect Batch");
  }
  return 0;
}