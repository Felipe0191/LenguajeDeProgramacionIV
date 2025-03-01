import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operaciones _Calculadora = new Operaciones();

        System.out.print("Ingrese la opcion deseada \n1.-Suma\n \n2.-Resta\n \n3.-Multiplicacion\n \n4.-Division\n");
        int opcion = sc.nextInt();
        double ValorA, ValorB;


        if (opcion == 1) {
            System.out.print("Ingrese el primer valor");
            ValorA = sc.nextDouble();
            System.out.print("Ingrese el segundo valor");
            ValorB = sc.nextDouble();
            System.out.print("El resultado de la suma es: " + _Calculadora.sumar(ValorA, ValorB));
        } else if (opcion == 2) {
            System.out.print("Ingrese el primer valor");
            ValorA = sc.nextDouble();
            System.out.print("Ingrese el segundo valor");
            ValorB = sc.nextDouble();
            System.out.print("El resultado de la resta es: " + _Calculadora.restar(ValorA, ValorB));
        } else if (opcion == 3) {
            System.out.print("Ingrese el primer valor");
            ValorA = sc.nextDouble();
            System.out.print("Ingrese el segundo valor");
            ValorB = sc.nextDouble();
            System.out.print("El resultado de la multiplicacion es: " + _Calculadora.multiplicar(ValorA, ValorB));
        } else if (opcion == 4) {
            System.out.print("Ingrese el primer valor");
            ValorA = sc.nextDouble();
            System.out.print("Ingrese el segundo valor");
            ValorB = sc.nextDouble();
            System.out.print("El resultado de la division es " + _Calculadora.dividir(ValorA, ValorB));
        } else {
            System.out.print("Opcion invalida");
        }
    }
}