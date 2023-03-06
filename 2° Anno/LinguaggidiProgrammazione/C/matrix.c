#ifndef _MATRIX_I
#define _MATRIX_I


#include <stdio.h>
#include <stdlib.h>
#include "matrix.h"

Matrix make_matrix(int nrows, int ncols){
    Matrix new_matrix = (Matrix) malloc(sizeof(struct _matrix));
    int i;
    int r;
    int c;

    new_matrix->nrows = nrows;
    new_matrix->ncols = ncols;

    new_matrix->m = (float **) malloc(sizeof(float *)* nrows);

    for(i = 0; i < nrows; i++){
        new_matrix->m[i] = (float *) malloc(sizeof(float) * ncols);
    }

    for(r = 0; r < nrows; r++){
        for(c = 0; c < ncols; c++){
            new_matrix->m[r][c] = 0.0;
        }
    }

    return new_matrix;

}

void matrix_fprint(FILE* out, Matrix m){
    int r = 0;
    int c = 0;

    for (r = 0; r < m->nrows; r++){
        fprintf(out, "[ ");
        for (c = 0; c < m->ncols; c++){
            fprintf(out, "%6f ", m->m[r][c]);
        }
        fprintf(out, "]\n");
    }
}

void matrix_print(Matrix m){
    matrix_fprint(stdout, m);
}

Matrix matrix_zero(int r, int c){
    return make_matrix(r, c);
}

Matrix matrix_id(int n){
    Matrix idm = make_matrix(n, n);
    int i, j;


    for(i=0; i<n; i++){
        idm->m[i][i] = 1.0;
    }

    return idm;
}

/* fare somma di matrici, moltiplicazione tra matrici e transposizione di matrici*/
#endif