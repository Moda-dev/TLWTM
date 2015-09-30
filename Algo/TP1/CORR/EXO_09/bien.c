/*
 * points à corriger :
 * - on aère en sautant des lignes pour séparer les blocs sémantiquement liés
 * - une seule instruction par ligne
 * - on indente
 * - on choisit des noms de variable parlant
 * - pas de variable globale
 * - une constante pour la taille du tableau
 * - on fait des fonctions car on aura vraisemblament besoin du même
 *   code ailleurs
 */

#include<stdlib.h>
#include<stdio.h>

void init(float tab[], int taille)
{
    for (int i = 0; i < taille; i++)
        tab[i] = 1.1 * (i+1);
}

void affiche(float tab[], int taille)
{
    for (int i = 0; i < taille; i++)
    {
        if (i != 0)
            printf(", ");
        printf("%g",  tab[i]);
    }
    printf("\n");
}

// le tableau doit contenir au moins une case, sinon comportement indéterminé
float moyenne(float tab[], int taille)
{
    float moyenne = 0.0;
    for (int i = 0; i < taille; i++)
        moyenne += tab[i];
    moyenne /= taille;

    return moyenne;
}
        

int main()
{
    #define N 5
    float tab[N];
    float moy;

    init(tab, N);
    affiche(tab, N);

    moy = moyenne(tab, N);
    printf("%g\n", moy);

    return EXIT_SUCCESS;
}
