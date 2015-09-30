// le fichier se compile ainsi :
//   gcc -Wall -Wextra -pedantic -std=c99 -o squelette_detail squelette_detail.c

// contient les déclarations et constantes de base
// ici on a besoin de la déclaration de EXIT_SUCCESS
// notez également l'existence de la constante EXIT_FAILURE
#include <stdlib.h>

/*
 * fonction principale qui est le point d'entrée dans le programme
 * on remarque qu'elle retourne un entier qui est récupérable
 * par l'appelent, i.e. généralement le shell
 */
int main()
{
    return EXIT_SUCCESS;
}
