package com.fernandaochoa.matrices;

import java.util.Scanner;

public class Matrices {
    // Abre clase Multiplicacion

    //Si se quiere multiplicar Matrices de distinta dimension
    //solo hay que cambiar los valores de M, N y P
    private int M = 3;
    private int N = 2;
    private int P = 4;
    private int Matriz1[][] = new int[N][M];
    private int Matriz2[][] = new int[M][P];
    private int Matriz3[][] = new int[N][P];

    Scanner entrada = new Scanner(System.in);


    //Metodo Recibe_Entradas1
    public void Recibe_Entradas1()

    { // Abre metodo Recibe_Entradas1

        System.out.printf("\nEste programa multiplica una matriz de %d columnas y %d renglones", M, N);
        System.out.printf(" con una de %d columnas y %d renglones\n\n", P, M);
        System.out.print("\nAqui se reciben las entradas de la primera matriz " );
        System.out.printf("de %d filas y %d columnas.\n", M, N );


        for ( int i = 0; i < N; i++ )
            for ( int j = 0; j < M; j++ )

            { // Abre for
                System.out.printf("Introduzca el valor de la entrada en el renglon %d  y la columna %d: ", i + 1,  j + 1 );
                Matriz1[i][j] = entrada.nextInt();
            } // Cierra for
    } // Cierra metodo Recibe_Entradas1



    public void Recibe_Entradas2( )

    { // Abre metodo Recibe_Entradas2

        System.out.print("\nAqui se reciben las entradas de la segunda matriz " );
        System.out.printf("de  %d  filas y %d columnas", M, P);

        for ( int i = 0; i < M; i++ )
            for ( int j = 0; j < P; j++ )
            { // Abre for
                System.out.printf("\nIntroduzca el valor en el renglon %d y la columna %d: ",  i + 1,  j + 1 );
                Matriz2[i][j] = entrada.nextInt();
            } // Cierra for

    } // Cierra metodo Recibe_Entradas2



    // Metodo Multiplicar
    public void Multiplicar( )

    { // Abre metodo Multiplicar

        for ( int k = 0; k < N; k++)
        { // abre primer ciclo for
            for ( int j = 0; j < P; j++)
            { // abre el segundo ciclo for
                for ( int i = 0; i < M; i++ )
                    Matriz3[ k ][j ] += Matriz1[k][i]*Matriz2[i][j];

            } // Cierra el segundo ciclo for
        }

    } // Cierra el metodo Multiplicar




    void Imprimir( )
    {  // Abre metodo Imprimir
        // Aqui se imprimen la dos Matrices y la matriz producto
        int i, j, k;

        System.out.printf("\n\nAQUI SE IMPRIMEN LAS DOS MATRICES Y EL PRODUCTO: \n\n");
        for ( i = 0; i < N; i++ )
        { // abre for que controla numero de renglones

            // Este ciclo imprime la primera matriz
            // No hay ningun problema para imprimir la primera matriz, ya que se
            // trata de un par de ciclos for. Sin embargo se quiere imprimir las
            // tres Matrices, lo cual hace un poquito mas complicado el asunto.
            // De todas formas la primera se imprime renglon por renglon
            // solo que antes de pasar al siguiente renglon, se escriben las entradas
            // correspondientes de la segunda y tercera Matrices.

            for ( k = 0; k < M; k++)
            { // Abre ciclo for
                System.out.printf("%3d", Matriz1[i][k]);
                // Se imprime el renglon i de la matriz 1
            } //Cierra ciclo for

            System.out.printf("\t\t"); // Esta instruccion separa una matriz de otra

            // Este ciclo imprime la segunda matriz

            for ( j = 0; j < P; j++)
            { // abre for
                if ( i <= (N - 1)) // El numero de columnas de la segunda matriz puede ser
                    // menor o mayor que el numero de filas de la primera
                    // Si es mayor no pasa nada, pero si es menor se estara
                    // haciendo referencia a un elemento inexistente en el arreglo
                    // El caso en el que N > M se trata fuera del ciclo controlado por i
                    // El -1 es debido a que i empieza a correr en cero

                    System.out.printf("%3d", Matriz2[i][j]); // se imprime el renglon i de la matriz 2

                else // De lo contrario solo se imprimen 3 espacios en blanco
                    // correspondientes con 3d

                    System.out.printf(" ");
            } // Cierra for

            System.out.printf ("\t\t"); // Esta instruccion separa la matriz 2 de la matriz
            // producto

            // Este es el ciclo que imprime la matriz producto
            for ( j = 0; j < P; j++ )
            { // abre for
                System.out.printf("%3d", Matriz3[i][j]);
                // se imprime el renglon i de la matriz producto
            } // Cierra for

            System.out.printf("\n");
            // Aqui se cambia de renglon
        } // Cierra for que controla numero de renglones

        // Es probable que N > M, por lo cual en el ciclo anterior no se
        // imprimiria la segunda matriz en su totalidad
        // Con el siguiente bloque se imprime lo que falta

        if ( M > N)
        { // Abre if
            int l = N;

            while ( l < M )
            { // Abre while
                for ( i = 0; i < M; i++)
                    System.out.printf(" ");
                System.out.printf("\t\t\t");
                for ( j = 0; j < P; j++ )
                    System.out.printf("%3d", Matriz2[l][j]);
                System.out.printf("\n"); // Aqui se cambia de linea
                l++; // Se incrementa el numero de linea
            } // Cierra while
        } // Cierra if
    }  // Cierra metodo Imprimir

    // Abre clase UsaMultiplicacion

    public static void main(String args[])
    {       // Abre main

        Matrices miObjeto = new Matrices();

        // Llamada a Recibe_Entradas1()
        miObjeto.Recibe_Entradas1();

        // Llamada a Recibe_Entradas2()
        miObjeto.Recibe_Entradas2();

        //Llamada a Multiplicar
        miObjeto.Multiplicar();

        //Llamada a metodo Imprime
        miObjeto.Imprimir();

    }       // Cierra main
}              // Cierra clase UsaMultiplicacion



