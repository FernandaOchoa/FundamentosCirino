package com.fernandaochoa.matrices;

import java.util.Scanner;

/*MultiplicacionMatrices.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: _______
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class MultiplicacionMatrices {

    //Si se quiere multiplicar Matrices de distinta dimension
    //solo hay que cambiar los valores de M, N y P
    private int M = 3;
    private int N = 2;
    private int P = 4;
    private int Matriz1[][] = new int[N][M];
    private int Matriz2[][] = new int[M][P];
    private int Matriz3[][] = new int[N][P];

    Scanner teclado = new Scanner(System.in);

    public void datos() {

        System.out.printf("\nMultiplica una matriz de %d columnas y %d renglones", M, N);
        System.out.printf(" con una de %d columnas y %d renglones\n\n", P, M);
        System.out.print("\nAqui se reciben las entradas de la primera matriz ");
        System.out.printf("de %d filas y %d columnas.\n", M, N);

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++) {
                System.out.printf("Introduzca el valor:");
                System.out.printf(" en el renglon %d y la columna %d: ", i + 1, j + 1);
                Matriz1[i][j] = teclado.nextInt();
                Matriz1[i][j] = teclado.nextInt();
            }
    }

    public void entradas() {
        System.out.print("\nAqui se reciben las entradas de la segunda matriz ");
        System.out.printf("de  %d  filas y %d columnas", M, P);

        for (int i = 0; i < M; i++)
            for (int j = 0; j < P; j++) {
                System.out.printf("\nIntroduzca el valor: ");
                System.out.printf("en %d y la columna %d: ", i + 1, j + 1);
                Matriz2[i][j] = teclado.nextInt();
            }
    }

    public void calculos() {
        for (int k = 0; k < N; k++) {
            for (int j = 0; j < P; j++) {
                for (int i = 0; i < M; i++)
                    Matriz3[k][j] += Matriz1[k][i] * Matriz2[i][j];
            }
        }
    }

    void resultados() {
        int i, j, k;

        System.out.printf("\n\nImprime las dos matrices y el producto: \n\n");
        for (i = 0; i < N; i++) { // numero de renglones
            // Este ciclo imprime la primera matriz
            // No hay ningun problema para imprimir la primera matriz, ya que se
            // trata de un par de ciclos for. Sin embargo se quiere imprimir las
            // tres Matrices, lo cual hace un poquito mas complicado el asunto.
            // De todas formas la primera se imprime renglon por renglon
            // solo que antes de pasar al siguiente renglon, se escriben las entradas
            // correspondientes de la segunda y tercera Matrices.

            for (k = 0; k < M; k++) {
                System.out.printf("%3d", Matriz1[i][k]);
                //Se imprime el renglon i de la matriz 1
            }
            System.out.printf("\t\t"); // separa una matriz de otra

            //imprime la segunda matriz

            for (j = 0; j < P; j++) {
                if (i <= (N - 1)) // El numero de columnas de la segunda matriz puede ser
                    // menor o mayor que el numero de filas de la primera
                    // Si es mayor no pasa nada, pero si es menor se estara
                    // haciendo referencia a un elemento inexistente en el arreglo
                    // El caso en el que N > M se trata fuera del ciclo controlado por i
                    // El -1 es debido a que i empieza a correr en cero

                    System.out.printf("%3d", Matriz2[i][j]);

                else // De lo contrario solo se imprimen 3 espacios en blanco
                    // correspondientes con 3d

                    System.out.printf(" ");
            }
            System.out.printf("\t\t"); //separa la matriz 2 de la matriz
            // producto

            // Este es el ciclo que imprime la matriz producto
            for (j = 0; j < P; j++) {
                System.out.printf("%3d", Matriz3[i][j]);
                // se imprime el renglon i de la matriz producto
            }
            System.out.printf("\n");
            // Aqui se cambia de renglon
        } // Cierra numero de renglones

        // Es probable que N > M, por lo cual en el ciclo anterior no se
        // imprimiria la segunda matriz en su totalidad
        // Con el siguiente bloque se imprime lo que falta

        if (M > N) {
            int l = N;
            while (l < M) {
                for (i = 0; i < M; i++)
                    System.out.printf(" ");
                System.out.printf("\t\t\t");
                for (j = 0; j < P; j++)
                    System.out.printf("%3d", Matriz2[l][j]);
                System.out.printf("\n");
                l++;
            }
        }
    }

    public static void main(String args[]) {

        MultiplicacionMatrices matrices = new MultiplicacionMatrices();

        matrices.datos();
        matrices.entradas();
        matrices.calculos();
        matrices.resultados();
    }
}