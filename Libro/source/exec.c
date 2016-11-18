/*
 * exec.c
 *
 *  Created on: 5 oct. 2016
 *      Author: alu
 */
#include <unistd.h>
#include <stdio.h>

void exec()
{
	printf("Ejemplo de uso de exec(): ");
	printf("Los archivos en el directorio son:\n");
	execl("/bin/ls", "ls", "-l",(char *)NULL);
	printf("ESTO NO SE EJECUTA\n");
}

