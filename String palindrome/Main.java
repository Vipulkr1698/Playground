#include <stdio.h> 
#include <string.h> 
  
// A function to check if a string str is palindrome 
void isPalindrome(char str[]) 
{ 
    // Start from leftmost and rightmost corners of str 
    int l = 0; 
    int h = strlen(str) - 1; 
  
    // Keep comparing characters while they are same 
    while (h > l) 
    { 
        if (str[l++] != str[h--]) 
        { 
            printf("%s is not a palindrome", str); 
            return; 
        } 
    } 
    printf("%s is a palindrome", str); 
} 
int main()
{
  int str[100];
  scanf("%s",&str);
  isPalindrome(str);
  return 0;
}