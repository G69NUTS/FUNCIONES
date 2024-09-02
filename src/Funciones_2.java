
import java.util.Scanner;

public class Funciones_2{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //SUMA

        System.out.println("Buenos dias dijite porfavor un numero: ");
        System.out.println("Numero 1:");
        int num_1 = leer.nextInt();
        System.out.println("Numero 2:");
        int num_2 = leer.nextInt();
        System.out.println("La suma de los numeros es: "+Suma(num_1,num_2));

        //MULTIPLICACION

        System.out.println("Dijite dos numeros para multiplicar");
        System.out.println("Numero 1");
        int Mul = leer.nextInt();
        System.out.println("Numero 2");
        int Por = leer.nextInt();
        int Res = 0;
        System.out.println("La multiplicacion de: " +Mul+ " por: " +Por+ " Es: "+Multiplicacion(Mul, Por,Res));

        //POTENCIACION

        System.out.println("Dijite La Base de la potenciacion:");
        System.out.println("Base: ");
        int Base = leer.nextInt();
        System.out.println("Potencia: ");
        int Potencia = leer.nextInt();
        int Pot = Base;
        System.out.println("El resultado de : "+Base+ " a la potencia de "+Potencia+ " Es igual a: "+Potenciacion(Base,Potencia,Pot));

        //FACTORIAL

        System.out.println("Dijite un un numero para sacarle factorial");
        System.out.println("Numero: ");
        int Num = leer.nextInt();
        int Sex = 1;
        System.out.println("El factorial de: "+Num+ " Es: "+Factorial(Num,Sex));

        //AREA DE UN CUADRADO

        System.out.println("Dijite el Lado de un cuadrado para sacar si area");
        System.out.println("LADO:");
        int Lado = leer.nextInt();
        int area = 0 ;
        System.out.println("El area del cuadrado es: "+Area(Lado,area));

        //AREA DE UN CIRCULO

        System.out.println("De el Radio de un circulo para calcular su AREA");
        System.out.println("RADIO");
        double Rad = leer.nextInt();
        double AREAR = 0 ;
        System.out.println("El area del circulo es: "+AREA_2(Rad,AREAR));

        //VOLUMEN DE UN CONO

        System.out.println("Dijite la altura y le radio de un Cono para Calcular su VOLUMEN");
        System.out.println("RADIO:");
        double Tad = leer.nextDouble();
        System.out.println("ALTURA:");
        int h = leer.nextInt();
        double NANI = 0 ;
        int DIV = 3 ;
        System.out.println("El Volumen de el Cono es: "+areacono(Tad,h,NANI,DIV));

        //SERIE DE FIBONACCI

        System.out.println("Dijite El numero al cual quiere hacer la serie de fibonacci");
        System.out.println("NUMERO:");
        int n = leer.nextInt();
        System.out.println("Los primeros " + n + " números de la serie de Fibonacci son:");
        mostrarSerieFibonacci(n);

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

    public static int Factorial(int Num,int Sex){
        for(int i=1;i<Num;i++){
            Sex = Sex*Sex;
            Sex++;
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

}