/*
 * exec.c
 *
 *  Created on: 5 oct. 2016
 *      Author: alu
 */
#include <unistd.h>
#include <stdio.h>

void main()
{
	printf("select: ");
	printf("\n 1) sis() "
			"\n 2) exec()");
	execl("/bin/ls", "ls", "-l",(char *)NULL);
	printf("ESTO NO SE EJECUTA\n");
}

