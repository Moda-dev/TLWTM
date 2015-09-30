#include <stdlib.h>
#include <stdio.h>

int main()
{
    int taille = 100;
    float * tab= NULL;

    tab = malloc(taille * sizeof(float));
    for (int i = 0; i < taille; i++)
        tab[i] = 1.1 * i;

    printf("la 15e case vaut : %g\n", tab[14]);
    printf("la 102e case vaut : %g\n", tab[101]);

    printf("Modification d'une case inexistante\n");
    tab[101] = 3.14;

    free(tab);
    
    return EXIT_SUCCESS;
}
