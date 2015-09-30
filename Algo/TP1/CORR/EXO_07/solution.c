#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>


void permute(int *a, int *b)
{
    int tmp = *a;
    *a = *b;
    *b = tmp;
}

int valabs(int v, bool *negatif)
{
    int result;
    if (v < 0)
    {
        *negatif = true;
        result = -v;
    }
    else
    {
        *negatif = false;
        result = v;
    }
    return result;
}

// ou plus élégant
int valabs_bis(int v, bool *negatif)
{
    *negatif = (v < 0);
    return abs(v);
}


int main()
{
    int a, b;
    int tab[2];
    bool neg;

    a = 3;
    b = 7;
    permute(&a, &b);
    printf("a = %d, b = %d\n", a, b);

    tab[0] = 3;
    tab[1] = 7;
    permute(&(tab[0]), &(tab[1]));
    printf("tab[0] = %d, tab[1] = %d\n", tab[0], tab[1]);

    a = valabs(5, &neg);
    if (neg)
        printf("%d ; c'était négatif\n", a);
    else
        printf("%d ; c'était positif\n", a);

    a = valabs(-5, &neg);
    if (neg)
        printf("%d ; c'était négatif\n", a);
    else
        printf("%d ; c'était positif\n", a);

    a = valabs_bis(5, &neg);
    if (neg)
        printf("%d ; c'était négatif\n", a);
    else
        printf("%d ; c'était positif\n", a);

    a = valabs_bis(-5, &neg);
    if (neg)
        printf("%d ; c'était négatif\n", a);
    else
        printf("%d ; c'était positif\n", a);

    return EXIT_SUCCESS;
}
