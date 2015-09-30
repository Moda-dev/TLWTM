#include <stdlib.h>
#include <stdio.h>

void question_a()
{
    printf("\nQuestion a\n");

    int a = 3, b = 5, c = 9;
    //int a = 3, b = 9, c = 5;
    //int a = 5, b = 3, c = 9;
    //int a = 5, b = 9, c = 3;
    //int a = 9, b = 3, c = 5;
    //int a = 9, b = 5, c = 3;

    // code brutal
    // il y  6 tests
    if ((a < b) && (a < c))
        printf("a est le plus petit\n");
    else if ((b < a) && (b < c))
        printf("b est le plus petit\n");
    else if ((c < a) && (c < b))
        printf("c est le plus petit\n");

    // code optimisé
    // il y a 3 tests
    if ((a < b) && (a < c))
        printf("a est le plus petit\n");
    else if (b < c)
        printf("b est le plus petit\n");
    else
        printf("c est le plus petit\n");

    /*
     * pour 3 nombres, il y a 6 facons de les ranger (cf. déclarations)
     *                 soit 3!
     * pour n nombres, il y a n*(n-1)*(n-2)*...*2*1 facons, soit n!
     */
}

void question_b()
{
    printf("\nQuestion b\n");

    int i;
    for (i = 0; i <= 5; i++)
        printf("dans la boucle : %d\n", i);
    printf("après la boucle : %d\n", i);

    printf("\n");
    
    for (int j = 0; j <= 5; j++)
        printf("dans la boucle : %d\n", j);
    //printf("après la boucle : %d\n", j);
    printf("après la boucle : j n'exsite plus\n");
}


void question_c()
{
    printf("\nQuestion c\n");
    
    int n = 100;
    //int n = 0;
    int somme;
    int i;

    somme = 0;
    for (i = 1; i <= n; i++)
        somme += i;
    printf("avec for, la somme est : %d\n", somme);

    somme = 0;
    i = 1;
    while (i <= n)
    {
        somme += i;
        i ++;
    }

    printf("avec while, la somme est : %d\n", somme);

    somme = 0;
    if (n > 0)
    {
        i = 1;
        do
        {
            somme += i;
            i ++;
        } while (i <= n);
    }
    printf("avec do while, la somme est : %d\n", somme);

    somme = n*(n+1)/2;
    printf("avec un calcul, la somme est : %d\n", somme);

}

void question_d()
{
    printf("\nQuestion d\n");

    int n = 5;
    //int n = 1;
    //int n = 0;

    for (int i = 1; i <= n; i ++)
    {
        for (int j = 1; j <= i; j ++)
            printf("*");
        printf("\n");
    }
}

void question_e()
{
    printf("\nQuestion e\n");

    int n = 5;
    //int n = 1;
    //int n = 0;

    // code non optimisé
    // dans le sens où les if sont inutiles la plupart du temps
    // il faudrait traiter la première et la dernière ligne hors de la boucle
    for (int i = 1; i <= n; i ++)
    {
        if (i == 1)
            printf("*");
        else if ((i > 1) && (i < n))
        {
            printf("*");
            for (int j = 2; j < i; j ++)
                printf(" ");
            printf("*");
        }
        else // i == n
        {
            for (int j = 1; j <= n; j ++)
                printf("*");
        }
        printf("\n");
    }
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
