#include <stdlib.h>
#include <stdio.h>


void affiche_carre(int n)
{
	int i = n*n;
	printf("Carré : %d.\n", i);
}

int somme(int a, int b)
{
	int i = a + b;
	return i;
}

int somme_1_n(int n)
{
	int i = n + 1;
	return i; 
}

int main()
{
	affiche_carre(6);
	affiche_carre(8);
	
	printf("12 + 65 : %d.\n", somme(12, 65));
	
	printf("54 + 1 : %d.\n", somme_1_n(54));
}
