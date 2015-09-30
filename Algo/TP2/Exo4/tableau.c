#include <stdlib.h>
#include <stdio.h>

int main()
{
	float * tab_float = NULL;
	int taille = 100;
	tab_float = malloc(taille * sizeof(float));
	
	for(int i = 0; i < taille; i++)
	{
		tab_float[i] = 1.1*i;
	}
	
	printf("%f\n", tab_float[15]);
	
	//Invalid write of size 4
	//at 0x400623: main (tableau.c:17)
	//Address 0x51f11dc is 12 bytes after a block of size 400 alloc'd
	//at 0x4C2B6CD: malloc (in /usr/lib/valgrind/vgpreload_memcheck-amd64-linux.so)
	//by 0x4005AB: main (tableau.c:8)
	tab_float[103] = 654;
	
	//Invalid read of size 4
	//at 0x40062F: main (tableau.c:18)
	//Address 0x51f11dc is 12 bytes after a block of size 400 alloc'd
	//at 0x4C2B6CD: malloc (in /usr/lib/valgrind/vgpreload_memcheck-amd64-linux.so)
	//by 0x4005AB: main (tableau.c:8)
	printf("%f\n", tab_float[103]);
	
	free(tab_float);
}


