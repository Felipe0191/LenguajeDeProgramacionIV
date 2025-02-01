import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("\n Suma \n Resta \n Multiplicacion\n Division\n");
        String opcion= Sc.nextLine();
        int a,b;

        switch (opcion) {
            case "Suma":
                System.out.print("Suma\n");
                System.out.print("Ingrese el primer valor: ");
                a=Sc.nextInt();
                System.out.print("Ingrese el segundo valor: ");
                b=Sc.nextInt();
                System.out.print("Resultado: ");
                System.out.println(a+b);
                break;
            case "Resta":
                System.out.print("Resta\n");
                System.out.print("Ingrese el primer valor: ");
                a=Sc.nextInt();
                System.out.print("Ingrese el segundo valor: ");
                b=Sc.nextInt();
                System.out.print("Resultado: ");
                System.out.println(a-b);
                break;
            case "Multiplicacion":
                System.out.print("Multiplicacion\n");
                System.out.print("Ingrese el primer valor: ");
                a=Sc.nextInt();
                System.out.print("Ingrese el segundo valor: ");
                b=Sc.nextInt();
                System.out.print("Resultado: ");
                System.out.println(a*b);
                break;
            case "Division":
                System.out.print("Division\n");
                System.out.print("Ingrese el primer valor: ");
                a=Sc.nextInt();
                System.out.print("Ingrese el segundo valor: ");
                b=Sc.nextInt();
                System.out.print("Resultado: ");
                System.out.println(a/b);
        }
    }
}