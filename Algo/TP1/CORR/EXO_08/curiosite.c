#include <stdlib.h>
#include <stdio.h>

int main()
{
    int i;

    i = 3;
    i = i++*++i;
    fprintf(stderr, "i apres : %d\n", i);

    *(&i) = 155;
    fprintf(stderr, "i apres : %d\n", i);
    
    return EXIT_SUCCESS;
}
