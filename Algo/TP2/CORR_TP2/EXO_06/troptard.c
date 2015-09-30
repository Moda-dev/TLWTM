// gcc -Wall -Wextra -pedantic -std=c99 -g -o troptard troptard.c
#include <stdlib.h>
#include <stdio.h>

#define N 10

int main()
{
    int *t = malloc(N*sizeof(int));
    for (int i = 0; i < N; i++)
        t[i] = 2*i;
    printf("%d\n", t[3]);
    free(t);
    printf("%d\n", t[3]);
    
    return EXIT_SUCCESS;
}

/*
  affichage de valgrind :
  
==5481== Invalid read of size 4
==5481==    at 0x8048493: main (troptard.c:13)
==5481==  Address 0x41ac034 is 12 bytes inside a block of size 40 free'd
==5481==    at 0x4025BF0: free (vg_replace_malloc.c:366)
==5481==    by 0x804848B: main (troptard.c:12)

valgrind indique non seulement l'erreur, mais également la ligne (ici 12)
où a été effectué le free arroné.
*/
