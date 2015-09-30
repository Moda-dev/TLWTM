#include <stdlib.h>
#include <stdio.h>


void question_a()
{
	int i = 12;
	int j = 16;
	int k = 16;
	
	//Algo absolument pas optimal. nbr tests mini = 2, nbr de tests max = 4. Mais ça marche.
	if ( i < j && i < k )
		printf("La plus petite valeur est : %d.\n", i);
		
	else if ( j < k  && j < i) 
		printf("La plus petite valeur est : %d.\n", j);
		
	else
		printf("La plus petite valeur est : %d.\n", k);
	
	//Algo opti, nbr tests mini = 1, nbr de tests max = 2.
	/*int l = 0;	
		
	if ( i > j || i > k  )
	{
		l = j;
		
		if ( j > i || j > k )
		{
			l = k;
		}
	}
	else
	{
		l = i;
	}	
	printf("La plus petite valeur est : %d.\n", l);	*/


}

void question_b()
{
	int i;
	for (i = 1; i <= 5; i++ )
	{
		printf("%d\n", i);
	}
	printf("%d\n", i);
	
	for (int j = 11; j <= 15; j++ )
	{
		printf("%d\n", j);
	}
	//impossible d'afficher j. Il semble que sa portée ne dépasse pas l'intérieur du for. 
	//printf("%d\n", j);
}

void question_c()
{
	int nombre = 100;
	int resultat = 0;
	int i;
	for( i = 0; i <= nombre; i++)
	{
		resultat = resultat + i;
		printf("%d\n", resultat);
	}
	printf("Avec la boucle for, on obtiens la valeur : %d.\n", resultat);
	
	nombre = 0;
	resultat = 0;
	while (nombre <= 100)
	{
		resultat = resultat + nombre;
		nombre++;
	}
	printf("Avec la boucle while, on obtiens la valeur : %d.\n", resultat);
	
	nombre = 0;
	resultat = 0;
	do
	{
		resultat = resultat + nombre;
		nombre++;
	}
	while (nombre <= 100);
	printf("Avec la boucle do while, on obtiens la valeur : %d.\n", resultat);
	
	nombre = 100;
	nombre = nombre*(nombre+1)/2;
	printf("Avec le calcul direct on obtient : %d.\n", nombre);
}

void question_d()
{
	int t = 10;

	for ( int i = 1; i <= t; i++ )
	{
		for ( int j = 0; j < i; j++ )
		{
			printf("*");
		}
	
		printf("\n");
	}
	
}

void question_e()
{
	int t = 10;

	for ( int i = 1; i < t; i++ )
	{
		for ( int j = 0; j < i; j++ )
		{
			//si l'on se trouve en début ou en fin de ligne, on ajoute une étoile
			if (j == 0 || j == (i-1) )
			{
				printf("*");
			}
			//si l'on se trouve en milieu de ligne, on ajoute un espace
			else
			{
				printf(".");
			}
		}
		printf("\n");
	}
	
	for ( int i = 0; i < t; i++ )
	{
		printf("*");
	}
	
	printf("\n");
}

int main()
{
	question_a();
	question_b();
	question_c();
	question_d();
	question_e();
	
	return EXIT_SUCCESS;
}
