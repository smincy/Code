#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
int main() {
  int a[20][20] = {};
  int n, b, c;
	scanf("%d", &n);
	for (int i = 1; i <= n; i++)
	{
		scanf("%d %d", &b, &c);
		a[b][c] = 1;
	}
	for (int i = 1; i <= 19; i++)
	{
		for (int j = 1; j <= 19; j++)
		{
			printf("%d ", a[i][j]);
		}

		printf("\n");
	}
  
	return 0;
}
