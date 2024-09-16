
import java.util.Arrays;
import java.util.Scanner;

public class Funciones_2{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Salida = 0;
        do {
            //MENU
            System.out.println("Muy buenas DIAS/TARDES que desea hacer:");
            MENU();
        }while( Salida!=0);
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
                for(int i = 0; i < 10;i++) {
                    System.out.println("Numero: ");
                    Numeros[i]= leer.nextInt();
                }

            }
            // MULTIPLICACION MATRICES

            if(Respuesta == 11){
                System.out.println("Ingrese porfavor los numeros que quiere multiplicar");
                int[][] Matri1 = new int[4][4];
                int[][] Matriz2 = new int[4][4];
                int[][] MatrizResultado = new int[4][4];

                for(int i = 0; i < Matri1.length;i++) {
                    for (int j = 0; j < Matri1.length; j++) {
                        System.out.println("Numero: ");
                        Matri1[i][j] = leer.nextInt();
                    }
                    System.out.println();
                }
                System.out.println("Segunda Matriz");
                for(int i = 0; i < Matriz2.length;i++) {
                    for (int j = 0; j < Matriz2.length; j++) {
                        System.out.println("Numero: ");
                        Matriz2[i][j] = leer.nextInt();
                    }
                    System.out.println();
                }

                System.out.println(Arrays.deepToString(multiplicacionMatrices(Matri1, Matriz2, MatrizResultado)));





            }













            //SALIDA DEL MENU

            if(Respuesta == 0){
                int Wow=0;
                System.out.println("Gracias por utilizar Nuestro programa");
                salidaMenu(Salida,Wow);
            }



    }



    //FUNCION SUMA

    public static int Suma(int num_1,int num_2){
        return num_1+num_2;
    }

    //FUNCION MULTIPLICACION

    public static int Multiplicacion(int Mul,int Por,int Res){
        for(int i=0;i<Por;i++){
             Res += Mul  ;
        }
        return Res;
    }

    //FUNCION POTENCIACION

    public static int Potenciacion(int Base,int Potencia,int Pot){
        for(int i=1;i<Potencia;i++){
            Pot = Pot*Base ;
        }
        return Pot;
    }

    //FACTORIAL

    public static int Factorial(int Num,int Sex,int Fac){
        for(int i=1;i<Num;i++){
            Sex = (Num*(Fac));

        }
        return Sex;
    }

    //AREA DE UN CUADRADO

    public static int Area(int Lado,int area){
        area=Lado*Lado;
        return area;
    }

    //AREA DE UN CIRCULO

    public static double AREA_2(double Rad,double AREAR){
        AREAR = Math.PI * Math.pow(Rad,2);
        return AREAR;
    }

    //VOLUMEN DE UN CONO

    public  static double areacono(double Tad,int h ,double NANI,int DIV){
        NANI = (Math.PI*Math.pow(Tad,2)*h)/DIV;
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
                """);
    }

    //FUNCION SUMA ARREGLOS

    public static int sumaArreglos(int[] arreglo,int Total){
        for (int j : arreglo) {
            Total += j;
        }
        return Total;
    }

    //FUNCION SALIDA DEL MENU

    public static int salidaMenu(int Salida,int Wow){
        Wow = Salida++;
      return Wow ;
    }

    //FUNCION COMPARACION ARREGLO

    public static int comparacionArreglo(int[]Numeros){

        if(Numeros[0]<Numeros[1]){

        }
        if(Numeros[1]<Numeros[2]){

        }
        if(Numeros[2]<Numeros[3]){

        }
        if(Numeros[3]<Numeros[4]){

        }
        if(Numeros[4]<Numeros[5]){

        }
        if(Numeros[5]<Numeros[6]){

        }
        if(Numeros[6]<Numeros[7]){

        }
        if(Numeros[7]<Numeros[8]){

        }
        if(Numeros[8]<Numeros[9]){

        }
        if(Numeros[9]<Numeros[10]){

        }
        if(Numeros[10]<Numeros[0]) {

        }
        if(Numeros[1]>Numeros[0]) {

        }
        if(Numeros[2]>Numeros[1]) {

        }
        if(Numeros[3]>Numeros[2]) {

        }
        if(Numeros[4]>Numeros[3]) {

        }
        if(Numeros[5]>Numeros[6]) {

        }
        if(Numeros[6]>Numeros[5]) {

        }
        if(Numeros[7]>Numeros[8]) {

        }
        if(Numeros[8]>Numeros[9]) {

        }
        if(Numeros[9]>Numeros[10]) {

        }
        if(Numeros[10]>Numeros[0]) {

        }

        return Numeros[0];
    }

    //FUNCION MULTIPLICACION DE MATRICES

    public static int[][] multiplicacionMatrices(int[][] Matri1, int[][] Matriz2, int[][] MatrizResultado){

        for (int i=0;i<Matri1.length;i++){
            for (int j=0;j<Matriz2[0].length;j++){
                MatrizResultado[i][j]= 0 ;
                for (int k=0;k<Matri1[0].length;k++){
                    MatrizResultado[i][j] += Matri1[i][k]*Matriz2[k][j];
                }
            }
        }

    return MatrizResultado;
    
    }

        //Principios SOLID
        //NOTA IMPORTANTE PARA UNAS SEMANAS: [I@85ede7b
        //



}