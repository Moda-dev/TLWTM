#include <stdlib.h>
#include <stdio.h>

int main()
{

	char t = 'd';
	int i = 5;
	float f = 83541332;
	
	printf("Bonjour monde.\n");
	printf("La valeur du char 't' est : %c\n", t);
	printf("La valeur de l'int 'i' est : %d\n", i);
	printf("La valeur du float 'f' est : %g\n", f);
	
	f = f-83541331;
	printf("La valeur du float 'f' est : %g\n", f);
	
	float g = 83541332-83541331;
	printf("La valeur du float 'g' est : %g\n", g);
	
	g = 3/2;
	printf("La valeur du float 'g' est : %g\n", g);
	
	g = 1.0*3/2;
	printf("La valeur du float 'g' est : %g\n", g);
	
	
	
	return EXIT_SUCCESS;
}
