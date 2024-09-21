
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public  class Funciones_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //MENU
        System.out.println("Muy buenas DIAS/TARDES que desea hacer:");
        MENU();

        System.out.println("Digita tu opcion: ");
        int Respuesta = leer.nextInt();

        //SUMA
        if (Respuesta == 1) {
            System.out.println("Buenos dias dijite porfavor los numeros: ");
            System.out.println("Numero 1:");
            int num_1 = leer.nextInt();
            System.out.println("Numero 2:");
            int num_2 = leer.nextInt();
            System.out.println("La suma de los numeros es: " + Suma(num_1, num_2));
        }
        //MULTIPLICACION
        if (Respuesta == 2) {
            System.out.println("Dijite dos numeros para multiplicar");
            System.out.println("Numero 1");
            int Mul = leer.nextInt();
            System.out.println("Numero 2");
            int Por = leer.nextInt();
            int Res = 0;
            System.out.println("La multiplicacion de: " + Mul + " por: " + Por + " Es: " + Multiplicacion(Mul, Por, Res));
        }
        //POTENCIACION
        if (Respuesta == 3) {
            System.out.println("Dijite La Base de la potenciacion:");
            System.out.println("Base: ");
            int Base = leer.nextInt();
            System.out.println("Potencia: ");
            int Potencia = leer.nextInt();
            System.out.println("El resultado de : " + Base + " a la potencia de " + Potencia + " Es igual a: " + Potenciacion(Base, Potencia, Base));
        }
        //FACTORIAL
        if (Respuesta == 4) {
            System.out.println("Dijite un un numero para sacarle factorial");
            System.out.println("Numero: ");
            int Num = leer.nextInt();
            int Sex = 1;
            int Fac = Num - 1;
            System.out.println("El factorial de: " + Num + " Es: " + Factorial(Num, Sex, Fac));
        }
        //AREA DE UN CUADRADO
        if (Respuesta == 5) {
            System.out.println("Dijite el Lado de un cuadrado para sacar si area");
            System.out.println("LADO:");
            int Lado = leer.nextInt();
            int area = 0;
            System.out.println("El area del cuadrado es: " + Area(Lado, area));
        }
        //AREA DE UN CIRCULO
        if (Respuesta == 6) {
            System.out.println("De el Radio de un circulo para calcular su AREA");
            System.out.println("RADIO");
            double Rad = leer.nextInt();
            double AREAR = 0;
            System.out.println("El area del circulo es: " + AREA_2(Rad, AREAR));
        }
        //VOLUMEN DE UN CONO
        if (Respuesta == 7) {
            System.out.println("Dijite la altura y le radio de un Cono para Calcular su VOLUMEN");
            System.out.println("RADIO:");
            double Tad = leer.nextDouble();
            System.out.println("ALTURA:");
            int h = leer.nextInt();
            double NANI = 0;
            int DIV = 3;
            System.out.println("El Volumen de el Cono es: " + areacono(Tad, h, NANI, DIV));
        }
        //SERIE DE FIBONACCI
        if (Respuesta == 8) {
            System.out.println("Dijite El numero al cual quiere hacer la serie de fibonacci");
            System.out.println("NUMERO:");
            int n = leer.nextInt();
            System.out.println("Los primeros " + n + " números de la serie de Fibonacci son:");
            mostrarSerieFibonacci(n);
        }
        //ARREGLOS SUMAS

        if (Respuesta == 9) {
            System.out.println("Digite la cantidad de numeros que quiere sumar");
            System.out.println("Numeros:");
            int Tamano = leer.nextInt();
            int Total = 0;
            int[] arreglo = new int[Tamano];
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("Digite los numeros");
                arreglo[i] = leer.nextInt();
            }
            System.out.println(sumaArreglos(arreglo, Total));
        }
        //ARREGLOS MENOR MAYOR

        if (Respuesta == 10) {
            System.out.println("Dijite los Diez numeros que quiere comparar");
            int[] Numeros = new int[10];
            for (int i = 0; i < 10; i++) {
                System.out.println("Numero: ");
                Numeros[i] = leer.nextInt();
            }

        }
        // MULTIPLICACION MATRICES

        if (Respuesta == 11) {
            System.out.println("Ingrese porfavor los numeros que quiere multiplicar");
            int[][] Matri1 = new int[4][4];
            int[][] Matriz2 = new int[4][4];
            int[][] MatrizResultado = new int[4][4];
            for (int i = 0; i < Matri1.length; i++) {
                for (int j = 0; j < Matri1.length; j++) {
                    System.out.println("Numero: ");
                    Matri1[i][j] = leer.nextInt();
                }
                System.out.println();
            }
            System.out.println("Segunda Matriz");
            for (int i = 0; i < Matriz2.length; i++) {
                for (int j = 0; j < Matriz2.length; j++) {
                    System.out.println("Numero: ");
                    Matriz2[i][j] = leer.nextInt();
                }
                System.out.println();
            }
            System.out.println(Arrays.deepToString(multiplicacionMatrices(Matri1, Matriz2, MatrizResultado)));
        }
        //PROMEDIO OCHO NUMEROS MATRICES

        if (Respuesta == 12) {
            System.out.println("Ingrese porfavor los ocho numeros que quiere promediar: ");
            double[] Prom = new double[8];
            double suma = 0;
            double promedio = 0;
            for (int i = 0; i < Prom.length; i++) {
                System.out.println("Numero:");
                Prom[i] = leer.nextInt();
            }
            System.out.println("El promedio total de los numeros es: " + Promedio8Numbers(Prom, suma, promedio));
        }
        //ROTACION DE MATRICES

        if (Respuesta == 13) {
            System.out.println("ingrese los 5 Numeros que quiere rotar a la derecha: ");
            int[] Rotation = new int[5];
            for (int i = 0; i < Rotation.length; i++) {
                System.out.println("Numero: ");
                Rotation[i] = leer.nextInt();
            }
            desplazarDerecha(Rotation);
        }
        //ORGANIZACION POR METODO BURBUJA

        if (Respuesta == 14) {
            System.out.println("Dijite los 7 numeros que quiere organizar");
            int[] Numeros = new int[7];
            for (int i = 0; i < Numeros.length; i++) {
                System.out.println("Numero "+(i+1)+" :");
                Numeros[i] = leer.nextInt();
            }
            ordenarBurbuja(Numeros);
        }
        //SUMA DE 2 VECTORES

        if (Respuesta==15) {
            int[] vector1 = new int[3];
            int[] vector2 = new int[3];
            // Pedir al usuario que ingrese los elementos del primer vector
            System.out.println("Ingrese los 3 elementos del primer vector:");
            for (int i = 0; i < 3; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                vector1[i] = leer.nextInt();
            }
            // Pedir al usuario que ingrese los elementos del segundo vector
            System.out.println("Ingrese los 3 elementos del segundo vector:");
            for (int i = 0; i < 3; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                vector2[i] = leer.nextInt();
            }
            // Sumar los dos vectores
            int[] vectorResultado = sumarVectores(vector1, vector2);
            // Mostrar el vector resultante
            System.out.println("Vector resultante de la suma:");
            for (int i = 0; i < 3; i++) {
                System.out.print(vectorResultado[i] + " ");
            }
        }
        //ENCONTRAR NOMBRE

        if (Respuesta==16){
            // Crear una lista para almacenar los nombres
            ArrayList<String> nombres = new ArrayList<>();
            // Solicitar al usuario que ingrese nombres (termina con "fin")
            System.out.println("Ingrese los nombres uno por uno (escriba 'fin' para terminar):");
            while (true) {
                String nombre = leer.nextLine();
                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }
                nombres.add(nombre);
            }
            // Solicitar el nombre a buscar
            System.out.print("Ingrese el nombre que desea buscar: ");
            String nombreBuscado = leer.nextLine();
            // Llamar a la función para buscar el nombre
            if (buscarNombre(nombres, nombreBuscado)) {
                System.out.println("El nombre '" + nombreBuscado + "' fue encontrado en la lista.");
            } else {
                System.out.println("El nombre '" + nombreBuscado + "' no fue encontrado en la lista.");
            }
        }
        //ELIMINACION DE DUPLICADOS DE UNA LISTA

        if(Respuesta==17){
            // Crear una lista para almacenar los 10 números
            ArrayList<Integer> numeros = new ArrayList<>();

            // Solicitar al usuario que ingrese 10 números
            System.out.println("Ingrese 10 números enteros:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros.add(leer.nextInt());
            }

            // Llamar a la función para eliminar duplicados
            ArrayList<Integer> listaUnica = eliminarDuplicados(numeros);

            // Mostrar la lista sin duplicados
            System.out.println("Lista sin duplicados:");
            for (int numero : listaUnica) {
                System.out.print(numero + " ");
            }
        }
        //TRANSPUESTA DE MATRIZ

        if (Respuesta==18) {
            // Crear una matriz 3x3
            int[][] matriz = new int[3][3];
            // Solicitar al usuario que ingrese los elementos de la matriz
            System.out.println("Ingrese los elementos de una matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = leer.nextInt();
                }
            }
            // Calcular la transpuesta usando la función
            int[][] transpuesta = calcularTranspuesta(matriz);
            // Mostrar la matriz transpuesta
            System.out.println("Matriz transpuesta:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(transpuesta[i][j] + " ");
                }
                System.out.println(); // Salto de línea para cada fila
            }
        }
    }


    //FUNCION SUMA

    public static int Suma(int num_1, int num_2) {
        return num_1 + num_2;
    }

    //FUNCION MULTIPLICACION

    public static int Multiplicacion(int Mul, int Por, int Res) {
        for (int i = 0; i < Por; i++) {
            Res += Mul;
        }
        return Res;
    }

    //FUNCION POTENCIACION

    public static int Potenciacion(int Base, int Potencia, int Pot) {
        for (int i = 1; i < Potencia; i++) {
            Pot = Pot * Base;
        }
        return Pot;
    }

    //FACTORIAL

    public static int Factorial(int Num, int Sex, int Fac) {
        for (int i = 1; i < Num; i++) {
            Sex = (Num * (Fac));

        }
        return Sex;
    }

    //AREA DE UN CUADRADO

    public static int Area(int Lado, int area) {
        area = Lado * Lado;
        return area;
    }

    //AREA DE UN CIRCULO

    public static double AREA_2(double Rad, double AREAR) {
        AREAR = Math.PI * Math.pow(Rad, 2);
        return AREAR;
    }

    //VOLUMEN DE UN CONO

    public static double areacono(double Tad, int h, double NANI, int DIV) {
        NANI = (Math.PI * Math.pow(Tad, 2) * h) / DIV;
        return NANI;
    }

    //SERIE DE FIBONACCI

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void mostrarSerieFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    //FUNCION MENU

    public static void MENU() {
        System.out.println("""
                    0. Terminar Programa
                    1. Sumar 2 numeros
                    2. Multiplicar 2 numeros con las sumas del 1
                    3. Potenciar 2 numeros con las sumas del 1
                    4. Calcular el factorial de 1 numero
                    5. Calcular el area de un cuadrado(recibiendo un lado)
                    6. Calcular el area de un circulo(recibiendo el radio)
                    7. Calcular el volumen de un cono(recibiendo el radio y la altura
                    8. Mostrar los n numeros de la serie de fibonacci(recibiendo n)
                    9. Sumar la cantidad de numeros que usted quiera
                    10.Encontrar Mayor Menor
                    11.Multiplicacion de Matricez 4x4
                    12.Promedio 8 numeros
                """);
    }

    //FUNCION SUMA ARREGLOS

    public static int sumaArreglos(int[] arreglo, int Total) {
        for (int j : arreglo) {
            Total += j;
        }
        return Total;
    }

    //FUNCION SALIDA DEL MENU

    public static int salidaMenu(int Salida, int Wow) {
        Wow = Salida++;
        return Wow;
    }

    //FUNCION COMPARACION ARREGLO

    public static int comparacionArreglo(int[] Numeros) {

        if (Numeros[0] < Numeros[1]) {

        }
        if (Numeros[1] < Numeros[2]) {

        }
        if (Numeros[2] < Numeros[3]) {

        }
        if (Numeros[3] < Numeros[4]) {

        }
        if (Numeros[4] < Numeros[5]) {

        }
        if (Numeros[5] < Numeros[6]) {

        }
        if (Numeros[6] < Numeros[7]) {

        }
        if (Numeros[7] < Numeros[8]) {

        }
        if (Numeros[8] < Numeros[9]) {

        }
        if (Numeros[9] < Numeros[10]) {

        }
        if (Numeros[10] < Numeros[0]) {

        }
        if (Numeros[1] > Numeros[0]) {

        }
        if (Numeros[2] > Numeros[1]) {

        }
        if (Numeros[3] > Numeros[2]) {

        }
        if (Numeros[4] > Numeros[3]) {

        }
        if (Numeros[5] > Numeros[6]) {

        }
        if (Numeros[6] > Numeros[5]) {

        }
        if (Numeros[7] > Numeros[8]) {

        }
        if (Numeros[8] > Numeros[9]) {

        }
        if (Numeros[9] > Numeros[10]) {

        }
        if (Numeros[10] > Numeros[0]) {

        }

        return Numeros[0];
    }

    //FUNCION MULTIPLICACION DE MATRICES

    public static int[][] multiplicacionMatrices(int[][] Matri1, int[][] Matriz2, int[][] MatrizResultado) {

        for (int i = 0; i < Matri1.length; i++) {
            for (int j = 0; j < Matriz2[0].length; j++) {
                MatrizResultado[i][j] = 0;
                for (int k = 0; k < Matri1[0].length; k++) {
                    MatrizResultado[i][j] += Matri1[i][k] * Matriz2[k][j];
                }
            }
        }
        return MatrizResultado;
    }

    //FUNCION PROMEDIO OCHO NUMEROS

    public static double Promedio8Numbers(double[] Prom, double suma, double promedio) {

        for (double v : Prom) {
            suma += v;
        }
        promedio = suma / Prom.length;
        return promedio;
    }

    //FUNCION ROTACION DE MATRICES

    public static void desplazarDerecha(int[] Rotation) {

        int ultimo = Rotation[Rotation.length - 1]; // Guardar el último elemento

        // Desplazar los elementos una posición hacia la derecha
        for (int i = Rotation.length - 1; i > 0; i--) {
            Rotation[i] = Rotation[i - 1];
        }
        // Colocar el último elemento en la primera posición
        Rotation[0] = ultimo;

        // Mostrar el arreglo desplazado
        System.out.println("Arreglo después del desplazamiento hacia la derecha:");
        for (int numero : Rotation) {
            System.out.print(numero + " ");
        }
    }

    //FUNCION ORDENAMIENTO POR BURBUJA

    public static void ordenarBurbuja(int[] numeros) {

        // Bucle para realizar múltiples pasadas
        for (int i = 0; i < numeros.length - 1; i++) {
            // Bucle interno para comparar y ordenar los elementos
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                // Intercambiar si el elemento actual es mayor que el siguiente
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }

    //FUNICION PARA SUMAR 2 VECTORES

    public static int[] sumarVectores(int[] vector1, int[] vector2) {
        int[] vectorResultado = new int[3]; // Crear un vector para almacenar el resultado
        for (int i = 0; i < 3; i++) {
            vectorResultado[i] = vector1[i] + vector2[i]; // Sumar elementos correspondientes
        }
        return vectorResultado;
    }

    //FUNCION BUSCAR NOMBRE

    public static boolean buscarNombre(ArrayList<String> nombres, String nombreBuscado) {
        return nombres.contains(nombreBuscado);
    }

    //FUNCION PARA ELMININAR NUMEROS REPETIDOS

    public static ArrayList<Integer> eliminarDuplicados(ArrayList<Integer> lista) {
        // Utilizar un conjunto (Set) para eliminar duplicados
        HashSet<Integer> conjunto = new HashSet<>(lista);
        // Convertir el conjunto de nuevo a una lista
        return new ArrayList<>(conjunto);
    }

    //FUNCION PARA TRANSPUESTA DE UNA MATRIZ 3X3

    // Función para calcular la transpuesta de una matriz 3x3
    public static int[][] calcularTranspuesta(int[][] matriz) {
        int[][] transpuesta = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[i][j] = matriz[j][i]; // Intercambiar filas por columnas
            }
        }
        return transpuesta;
    }
}


//Principios SOLID
        //NOTA IMPORTANTE PARA UNAS SEMANAS: [I@85ede7b
        //



