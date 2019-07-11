#include<stdio.h>
int main()
{
  //Type your code here
 int m,n,i,j,item,loc=-1,loc1=-1;
 scanf("%d",&m);
 scanf("%d",&n);
int a[m][n];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
scanf("%d",&a[i][j]);
}
}
scanf("%d",&item);
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(item==a[i][j])
{
loc=i;
loc1=j;
break;
}
}
}
printf("(%d, %d)",loc,loc1);

  return 0;
}
