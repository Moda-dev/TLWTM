#include <stdlib.h>
#include <stdio.h>

// code juste
void add (int *v, int inc)
{
    *v = *v + inc;
}

int main()
{
    int value = 13;
    add(&value, 2);
    printf("apres l'appel : %d\n", value);
    
    return EXIT_SUCCESS;
}
