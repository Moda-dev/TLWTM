#include <stdlib.h>
#include <stdio.h>

void f()
{
    int *t = malloc(20*sizeof(int));
}

int main()
{
    int *t = malloc(10*sizeof(int));
    int *u = malloc(3*sizeof(int));
    f();
    
    return EXIT_SUCCESS;
}
