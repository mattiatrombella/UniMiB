#ifndef _MATRIX_H
#define _MATRIX_H
#include <stdlib.h>
#include <stdio.h>

struct _matrix {
    int nrows;
    int ncols;
    float ** m;
};

typedef struct _matrix * Matrix;

extern Matrix make_matrix(int, int);

extern void matrix_print(Matrix);
extern void matrix_fprint(FILE*, Matrix);
extern Matrix matrix_id(int);
extern Matrix matrix_zero(int, int);

#endif
