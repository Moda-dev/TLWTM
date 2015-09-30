#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

void add(int *v, int inc)
{
	*v = *v + inc;
}

void swap(int *var1, int *var2)
{
	int temp;
	temp = *var1;
	*var1 = *var2;
	*var2 = temp;
}

int absolut(int nombre, bool *estPositif)
{
	*estPositif = true;
	int resultat;
	resultat = nombre;
	
	if (nombre < 0)
	{
		resultat = nombre*(-1);
		*estPositif = false;
	}
	
	return resultat;
}

int main()
{
	int value  = 13;
	add(&value, 2);
	printf("Après l'appel : %d.\n", value);
	
	int a = 12;
	int b = 45;
	swap( &a, &b );
	printf("Après le swap => a = %d  /  b = %d.\n", a, b);
	
	int tab1[5] = {1, 2, 3, 4, 5};   // a eviter generalement
	swap( &tab1[0], &tab1[4] );
	printf("Après le swap => tab1[0] = %d  /  tab1[4] = %d.\n", tab1[0], tab1[4]);
	
	bool estPositif = true;
	printf("%d", absolut(35, &estPositif));
	printf("%d", estPositif);
	return EXIT_SUCCESS;
}
