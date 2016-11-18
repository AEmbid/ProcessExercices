/*
 * fifoescribe.c
 *
 *  Created on: 24 oct. 2016
 *      Author: alu
 */


#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	int fp;
	char saludo[] = "Un saludo!!!\n";
	fp = open("FIFO2", 1);

	if (fp==-1) {
		printf("Error abriendo archivo");
		exit(1);
	}

	printf("Mandando información al FIFO....\n");
	write(fp, saludo, strlen(saludo));
	close(fp);
	exit(0);

}
