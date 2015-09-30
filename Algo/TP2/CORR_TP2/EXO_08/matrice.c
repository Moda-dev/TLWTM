// gcc -Wall -Wextra -pedantic -std=c99 -g -o matrice matrice.c
#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>


float ** creer_tableau(int nbLignes, int nbColonne)
{
    float **tab;

    tab = malloc(nbLignes * sizeof(float *));
    for (int l = 0; l < nbLigndouble libérationes; l++)
        tab[l] = malloc(nbColonne * sizeof(float));

    return tab;
}

// le nombre de colonnes n'est pas nécessaire
void liberer_tableau(float **tab, int nbLignes)
{
    for (int l = 0; l < nbLignes; l++)
        free(tab[l]);
    free(tab);
}

void init_tab(float **tab, int nbLignes, int nbColonne)
{
    for (int l = 0; l < nbLignes; l++)
        for (int c = 0; c < nbColonne; c++)
            tab[l][c] = 1.1*l + c*c;
}

void afficher_tab(float **tab, int nbLignes, int nbColonne)
{
    for (int l = 0; l < nbLignes; l++)
    {
        printf("[");
        bool first = true;
        for (int c = 0; c < nbColonne; c++)
        {
            if (first)
                first = false;
            else
                printf(", ");
            printf("%5.1f", tab[l][c]);
        }
        printf("]\n");
    }
}

int main()
{
    const int L = 5;
    const int C = 7;
    float **t = creer_tableau(L, C);

    init_tab(t, L, C);
    afficher_tab(t, L, C);

    liberer_tableau(t, L);
    
    return EXIT_SUCCESS;
}
