#include <stdlib.h>
#include <stdio.h>

void memLeak()
{
	float * tab_float = NULL;
	int taille = 15;
	tab_float = malloc(taille * sizeof(float));
	
	for(int i = 0; i < taille; i++)
	{
		tab_float[i] = 0.5*i;
		
	}
}

int main()
{
	float * tab_float = NULL;
	int taille = 100;
	tab_float = malloc(taille * sizeof(float));
	
	int * tab_int = NULL;
	tab_int = malloc(taille * sizeof(int));
	
	for(int i = 0; i < taille; i++)
	{
		tab_float[i] = 1.1*i;
	}
	
	for(int i = 0; i < taille; i++)
	{
		tab_int[i] += 1;
	}
	
	memLeak();
}
	
	
