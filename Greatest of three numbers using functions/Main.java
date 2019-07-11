#include<stdio.h>
 
int main() {
    int a, b,c,d;
    scanf("%d%d%d", & a, & b , &c);
  	d = greater(a,b);
    printf("%d", greater(d,c));
 
    return 0;
 }
int greater(long a, long b) {
  if (a>b)
    return a;
  else
    return b;
}