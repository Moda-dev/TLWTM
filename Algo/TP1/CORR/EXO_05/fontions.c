#include <stdlib.h>
#include <stdio.h>

void affiche_carre(int n)
{
    printf("le carre de %d est %d\n", n, n*n);
}

int somme(int a, int b)
{
    return a+b;
}

int somme_1_n(int n)
{
    int s = 0;
    for (int i = 1; i <= n; i++)
        s += i;
    return s;
}

int main()
{
    affiche_carre(5);
    affiche_carre(25);

    printf("3+4 = %d\n", somme(3, 4));
    printf("25+-4 = %d\n", somme(25, -4));

    printf("somme 1..5 = %d\n", somme_1_n(5));
    printf("somme 1..99 = %d\n", somme_1_n(99));
    
    return EXIT_SUCCESS;
}
