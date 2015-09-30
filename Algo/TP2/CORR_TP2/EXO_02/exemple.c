#include <stdlib.h>
#include <stdio.h>

int main()
{
    float * p_reel = NULL;
    int * tab_entiers = NULL;
    int taille;

    p_reel = malloc(sizeof(float));
    taille = 15;
    tab_entiers = malloc(taille * sizeof(int));

    *p_reel = 3.14159;
    printf("%f\n", *p_reel);
    tab_entiers[2] = 158;
    printf("%d\n", tab_entiers[2]);

    free(p_reel);
    free(tab_entiers);
    
    return EXIT_SUCCESS;
}
