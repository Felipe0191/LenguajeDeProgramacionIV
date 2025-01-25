import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero= scanner.nextInt();
        //>10//
        if(numero>10){
            System.out.print("El numero ingresado es mayor a 10!");
        }else if (numero<10){
            //<10//
            System.out.print("El numero ingresado es menor a 10!");
            //==10//
        }else
            System.out.print("El numero ingresado es igual a 10");

        scanner.close();
    }
}