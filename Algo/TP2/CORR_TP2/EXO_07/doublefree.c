// gcc -Wall -Wextra -pedantic -std=c99 -g -o doublefree doublefree.c
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
    free(t);
    
    return EXIT_SUCCESS;
}

/*
  affichage de valgrind :
  
 1 ==5616== Memcheck, a memory error detector
 2 ==5616== Copyright (C) 2002-2010, and GNU GPL'd, by Julian Seward et al.
 3 ==5616== Using Valgrind-3.6.1 and LibVEX; rerun with -h for copyright info
 4 ==5616== Command: ./doublefree
 5 ==5616== 
 6 6
 7 ==5616== Invalid free() / delete / delete[]
 8 ==5616==    at 0x4025BF0: free (vg_replace_malloc.c:366)
 9 ==5616==    by 0x8048497: main (doublefree.c:14)
10 ==5616==  Address 0x41ac028 is 0 bytes inside a block of size 40 free'd
11 ==5616==    at 0x4025BF0: free (vg_replace_malloc.c:366)
12 ==5616==    by 0x804848B: main (doublefree.c:13)
13 ==5616== 
14 ==5616== 
15 ==5616== HEAP SUMMARY:
16 ==5616==     in use at exit: 0 bytes in 0 blocks
17 ==5616==   total heap usage: 1 allocs, 2 frees, 40 bytes allocated
18 ==5616== 
19 ==5616== All heap blocks were freed -- no leaks are possible
20 ==5616== 
21 ==5616== For counts of detected and suppressed errors, rerun with: -v
22 ==5616== ERROR SUMMARY: 1 errors from 1 contexts (suppressed: 11 from 6)

valgrind indique la ligne du free invalide (ligne 14), et où le bloc avait
été précédemment libéré (ligne 13)
*/
