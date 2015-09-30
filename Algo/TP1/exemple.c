#include <stdlib.h>
#include <stdio.h>


void init_zero(float t[], int taille)
{
    for (int i = 0; i < taille; i++)
        t[i] = 0.0;
}

void init_basic(float t[], int taille)
{
    for (int i = 0; i < taille; i++)
        t[i] = 1.0/(i+1);
}

void affiche(float t[], int taille)
{
    for (int i = 0; i < taille; i++)
        printf("%g, ", t[i]);
    printf("\n");
}

void init_entiers(float t[], int taille)
{
	for (int i = 0; i < taille; i++)
	{
		t[i] = i;
	}
}

void decale(float t[], int taille)
{
	int temp = t[taille-1];
	
	for (int i = taille-1 ; i >= 0 ; i--)
	{
		t[i] = t[i-1];	
	}
	
	t[0] = temp;
}

void miroir(float t[], int taille)
{
	int temp = 0;
	
	for ( int i = 0; i < taille/2; i++ )
	{
		temp = t[i];
		t[i] = t[taille-1-i];
		t[taille-1-i] = temp;
	}
}


#define N1 5
#define N2 8
#define N3 13
#define N4 7

int main()
{
    float tab1[N1] = {3.2, 2.1, -8.4, 0.0, 5.5};   // a eviter generalement
    float tab2[N2];
    float tab3[N3];
    float tab4[N4];
    float tab5[N4];

    init_zero(tab2, N2);
    init_basic(tab3, N3);
    init_entiers(tab4, N4);
    init_entiers(tab5, N4);

    affiche(tab1, N1);
    printf("__________ // \n");
    affiche(tab2, N2);
    printf("__________ // \n");
    affiche(tab3, N3);
    printf("__________ // \n");
    affiche(tab4, N4);
    printf("__________ // \n");
    decale(tab4, N4);
    affiche(tab4, N4);
    printf("__________ // \n");  
    miroir(tab5, N4);
    affiche(tab5, N4);
    printf("__________ // \n");       
    return EXIT_SUCCESS;
}
