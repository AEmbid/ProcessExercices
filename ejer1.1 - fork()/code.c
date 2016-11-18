/*
 * code.c
 *
 *  Created on: 17 oct. 2016
 *      Author: alu
 */
#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>

int num = 6;

void main() {
	pid_t pid[2];
	int status;

	printf("Valor inicial de la variable: %d \n", num);

	fflush(stdout); //limpieza de buffer
	pid[0] = fork(); //división de proceso PADRE -> HIJO

	//error check
	if (pid[0] == -1) {
		printf("\t Proceso hijo de %d no creado \n", getpid());
		exit(-1);
	}

	//codigo de proceso hijo general
	else if (pid[0] == 0) {

		pid[1] = fork(); //división de proceso HIJO -> NIETO

		//error check
		if (pid[1] == -1) {
			printf("\t Proceso hijo de %d no creado \n", getpid());
			exit(-1);

		//codigo proceso nieto / solo nieto
		} else if (pid[1] == 0) {
			num += 2;
			printf("\t\t\tSoy %d, el nieto, mi padre es %d y num es %d \n", getpid(), getppid(), num);


		//codigo solo hijo
		} else {
			num -= 5;
			wait(&status);
			printf("\t\tSoy %d, mi padre es %d y num es %d \n", getpid(), getppid(), num);

		}
		//exit(0);

	//codigo solo padre
	} else {
		num += 5;
		wait(&status);
		printf("\tSoy %d y num es %d \n", getpid(), num);
		printf("\tMi padre es el SO, %d", getppid());
	}
	exit(0);
}
