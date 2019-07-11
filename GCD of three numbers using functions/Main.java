#include<stdio.h>
 
int main() {
    int a, b,c,d;
    scanf("%d%d%d", & a, & b , &c);
  	d = gcd(a,b);
    printf("%d", gcd(d,c));
 
    return 0;
 }
int gcd(long a, long b) {
  if (b == 0)
    return a;
  else
    return gcd(b, a % b);
}