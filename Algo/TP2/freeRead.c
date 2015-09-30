#include <stdlib.h>
#include <stdio.h>


int main()
{
	float * tab_float = NULL;
	int taille = 100;
	tab_float = malloc(taille * sizeof(float));
	
	for(int i = 0; i < taille; i++)
	{
		tab_float[i] = 1.1*i;
	}
	
	free(tab_float);
	
	printf("%f\n", tab_float[15]);
}

