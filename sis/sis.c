/*
 * sis.c
 *
 *  Created on: 5 oct. 2016
 *      Author: alu
 */

#include <stdio.h>
#include <stdlib.h>

void main()
{
	printf("Ejemplo de uso de system(): ");
	printf("\n\t Listado del directorio actual y envio a un fichero: ");
	printf("%d", system("ls -l > ficsalida "));
	printf("\n\t Abrimos el fichero con gedit.... ");
	printf("%d", system("cat ficsalida "));
	printf("\n\t Este comando es erróneo: %d ", system("ged"));
	printf("\n Fin de programa... \n ");
}
