import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        //
        System.out.print("Ingrese una opcion: \n1.-Multiplicar. \n2.-Sumar. \n3.-Restar. ");
        int opcion= scanner.nextInt();
        //
        if(opcion==1) {
            System.out.println("Ingresa el valor para A");
            int A = scanner.nextInt();
            System.out.println("Ingresa el valor para B");
            int B = scanner.nextInt();
            System.out.println("Resultado");
            System.out.println(A*B);
        }else if (opcion==2) {
            System.out.println("Ingresa el valor para A");
            int A = scanner.nextInt();
            System.out.println("Ingresa el valor para B");
            int B = scanner.nextInt();
            System.out.println("Resultado");
            System.out.println(A+B);
        }else {
            System.out.println("Ingresa el valor para A");
            int A = scanner.nextInt();
            System.out.println("Ingresa el valor para B");
            int B = scanner.nextInt();
            System.out.println("Resultado");
            System.out.println(A - B);
        }
    }
}