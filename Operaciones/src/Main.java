import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora _Calculadora = new Calculadora();

        System.out.print("Ingrese la opcion deseada \n1.-Suma\n \n2.-Resta\n \n3.-Multiplicacion\n \n4.-Division\n");
        int opcion = sc.nextInt();
        double ValorA,ValorB;
        String Calculadora = sc.next();

        switch (opcion){
            case 1:
                System.out.print("Ingrese el primer valor");
                ValorA = sc.nextDouble();
                System.out.print("Ingrese el segundo valor");
                ValorB = sc.nextDouble();
                System.out.print("El resultado de la suma es: "+ _Calculadora.sumar(ValorA,ValorB));
                break;
            case 2:
                System.out.print("Ingrese el primer valor");
                ValorA = sc.nextDouble();
                System.out.print("Ingrese el segundo valor");
                ValorB = sc.nextDouble();
                System.out.print("El resultado de la resta es: " +_Calculadora.restar(ValorA,ValorB));
                break;
            case 3:
                System.out.print("Ingrese el primer valor");
                ValorA = sc.nextDouble();
                System.out.print("Ingrese el segundo valor");
                ValorB = sc.nextDouble();
                System.out.print("El resultado de la multiplicacion es: "+_Calculadora.multiplicar(ValorA,ValorB));
                break;
            case 4:
                System.out.print("Ingrese el primer valor");
                ValorA = sc.nextDouble();
                System.out.print("Ingrese el segundo valor");
                ValorB = sc.nextDouble();
                System.out.print("El resultado de la division es "+_Calculadora.dividir(ValorA,ValorB));
                break;
            default:
                System.out.print("Opcion invalida");
        }
    }
}