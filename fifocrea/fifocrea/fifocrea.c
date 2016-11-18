/*
 * fifocrea.c
 *
 *  Created on: 24 oct. 2016
 *      Author: alu
 */

#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>

int main(void) {
	int fp;
	int p, bytesleidos;
	char saludo[] = "Un saludo!!!\n", buffer[10];

	p=mknod("FIFO2.lnk", S_IFIFO|0666, 0); //permisos de lectura/escritura

	if (p == -1) {
		printf("ERROR");
		exit(0);
	}

	while (1) {
		fp = open ("FIFO2", 0);
		bytesleidos = read(fp, buffer, 1);
		printf("obteniendo info....");
		while (bytesleidos!=0) {
			printf("%s", buffer);
			bytesleidos = read(fp, buffer, 1);
		}
		close(fp);
	}
	return (0);
}

