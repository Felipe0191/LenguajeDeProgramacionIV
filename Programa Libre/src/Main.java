import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
         int Opcion;

        System.out.println("1.Comprar Coca Cola");
        System.out.println("2.Comprar Pepsi");
        System.out.println("3.Comprar Dr.Pepper");

        System.out.print("Que opcion desea realizar:");

         Opcion = Sc.nextInt();
         switch (Opcion){
             case 1:
                 System.out.printf("Coca Cola comprada rque tenga buen dia ");
                 break;
             case 2:
                 System.out.printf("Pepsi comprada que tenga buen dia");
                 break;
             case 3:
                 System.out.printf("Dr.Pepper comprada que tenga buen dia :)");
                 break;

             default: System.out.println("De esa no hay joven");
         }

    }
}