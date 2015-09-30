#include <stdlib.h>
#include <stdio.h>

int main()
{
    char c = 'z';
    int i = 34;
    float f = 3.14;

    // affichage
    printf("La valeur de c est %c\n", c);
    printf("La valeur de i est %d\n", i);
    printf("La valeur de f est %f\n", f);
    printf("La valeur de f est %g\n", f);
    printf("Les 3 valeurs sont : %c, %d, %g\n", c, i, f);


    // suite de résultats plus ou moins surprenants
    f = 83541332;
    f = f - 83541331;
    printf("La valeur de f est %g\n", f);

    f = 83541332 - 83541331;
    printf("La valeur de f est %g\n", f);

    f = 3/2;
    printf("La valeur de f est %g\n", f);

    f = 1.0*3/2;
    printf("La valeur de f est %g\n", f);

    return EXIT_SUCCESS;
}
