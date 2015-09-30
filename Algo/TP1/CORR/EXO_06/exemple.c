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


#define N1 5
#define N2 8
#define N3 13

int main()
{
    float tab1[N1] = {3.2, 2.1, -8.4, 0.0, 5.5};   // a eviter generalement
    float tab2[N2];
    float tab3[N3];

    init_zero(tab2, N2);
    init_basic(tab3, N3);

    affiche(tab1, N1);
    affiche(tab2, N2);
    affiche(tab3, N3);
    
    return EXIT_SUCCESS;
}
