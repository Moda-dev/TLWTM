#include <stdlib.h>
#include <stdio.h>

int main()
{
    int i = 3;
    i = (++i)+(i++);
    printf ("i apres : %d\n", i);
    
    i = 3;
    i = i++*++i;
    printf ("i apres : %d\n", i);

    i = 0;
    if (! i)
        printf("i est nul\n");
    
    return EXIT_SUCCESS;
}
