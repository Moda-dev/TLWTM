#include <stdlib.h>
#include <stdio.h>


// solution peu efficace
// complexité en n^2, i.e. proportionnelle au carré de la taille du tableau
void init_somme_quadratique(int t[], int taille)
{
    for (int i = 0; i < taille; i++)
    {
        int somme = 0;
        for (int j = 1; j <= i; j++)
            somme += j;
        t[i] = somme;
    }
}

// solution efficace
// complexité en n, i.e. proportionnelle à la taille du tableau
void init_somme_lineaire(int t[], int taille)
{
    if (taille > 0)  // pour gérer correctement le cas taille == 0
    {
        t[0] = 0;
        for (int i = 1; i < taille; i++)
            t[i] = t[i-1] + i;
    }
}

// attention à bien parcourir le tableau à partir de la fin ;
// si ce n'est pas clair, essayez de faire une boucle à l'endroit
// le cas taille == 0 est traité, mais est-ce que le cas taille == 1 est
// bien traité ,
void decale(int t[], int taille)
{
    if (taille > 0)
    {
        int tmp = t[taille-1];
        for (int i = taille-1; i > 0; i--)
            t[i] = t[i-1];
        t[0] = tmp;
    }
}

// vérifier que l'algo fonctionne que taille soit pair ou impair
void miroir(int t[], int taille)
{
    for (int i = 0; i < taille/2; i++)
    {
        int tmp = t[i];
        t[i] = t[taille-i-1];
        t[taille-i-1] = tmp;
    }
}


void affiche(int t[], int taille)
{
    printf("[");
    for (int i = 0; i < taille; i++)
    {
        if (i > 0)
            printf(", ");
        printf("%d", t[i]);
    }
    printf("]\n");
}


#define N 15

int main()
{
    int tab1[N];
    int tab2[N];

    init_somme_quadratique(tab1, N);
    init_somme_lineaire(tab2, N);

    affiche(tab1, N);
    affiche(tab2, N);

    decale(tab1, N);
    affiche(tab1, N);

    miroir(tab2, N);
    affiche(tab2, N);
    
    return EXIT_SUCCESS;
}
