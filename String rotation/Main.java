// C program to check if two given strings are rotations of  
// each other 
# include <stdio.h> 
# include <string.h> 
# include <stdlib.h> 
  
/* Function checks if passed strings (str1 and str2) 
   are rotations of each other */
int areRotations(char *str1, char *str2) 
{ 
  int size1   = strlen(str1); 
  int size2   = strlen(str2); 
  char *temp; 
  void *ptr; 
  
  /* Check if sizes of two strings are same */
  if (size1 != size2) 
     return 0; 
  
  /* Create a temp string with value str1.str1 */
  temp   = (char *)malloc(sizeof(char)*(size1*2 + 1)); 
  strcat(temp, str1); 
  strcat(temp, str1); 
  
  /* Now check if str2 is a substring of temp */
  ptr = strstr(temp, str2); 
  
  free(temp); // Free dynamically allocated memory 
  
  /* strstr returns NULL if the second string is NOT a 
    substring of first string */
  if (ptr != NULL) 
    return 1; 
  else
    return 0; 
} 
  
/* Driver program to test areRotations */
int main() 
{ 
    char str1[20]; 
    char str2[20];
      scanf("%s",&str1);
      scanf("%s",&str2);
  
    if (areRotations(str1, str2)) 
       printf("Yes"); 
    else
       printf("No"); 
  
    getchar(); 
    return 0; 
} 