/*
 * gps.c
 *
 *  Created on: 7 oct. 2016
 *      Author: alu
 */
#include <unistd.h>
#include <stdio.h>

void main() {
	printf("Uso de getpid: ..... ");
	printf("%d", getpid());
	printf("\n\tLista de procesos \n");
	execl("bin/ps", "ps", NULL);

}

