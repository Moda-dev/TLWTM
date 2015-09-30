// compilation :
// gcc -Wall -Wextra -pedantic -std=c99 -o hello_detail hello_detail.c 

#include <stdlib.h>
#include <stdio.h>     // pour utiliser printf

int main()
{
    // pour afficher une chaine simple, on la met entre guillemets
    // le  \n signifie que l'on passe à la ligne
    // \t ferait une tabulation
    printf("Hello World!\n");
    return EXIT_SUCCESS;
}
