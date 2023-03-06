#ifndef _MATRIX_I
#define _MATRIX_I


#include <stdio.h>
#include <stdlib.h>
#include "matrix.h"

int main(){
    Matrix m44 = make_matrix(4, 4);

    printf("\n>>>> The Matrix is: \n");
    matrix_print(m44); 

    Matrix i33 = matrix_id(5);
    printf("\n>>>> The Matrix is: \n");
    matrix_print(i33); 
}

#endif