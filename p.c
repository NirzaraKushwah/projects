#include<stdio.h>
int main()
{
	char ch='a';
	printf("%d",sizeof(7+4.57));
	printf("%d",sizeof('A'));
	printf("%d",sizeof(ch));
	printf("%d",sizeof(4.321)+4);
	printf("%d",sizeof(int));
	return 0;
}
