import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opc;
        Scanner tcl = new Scanner(System.in);


        Cliente c1 = new Cliente();
        Celular cl1 = new Celular();
        Laptop l1 = new Laptop();



        System.out.println("""
                
                ********MENU********
                1. Crear nuevo cliente
                2. Crear Celular
                3. Crear Laptop
                4. Realizar compra
                5. Mostrar resumen de compra
                
                """);
        opc = tcl.nextInt();
        switch (opc){

            case 1 -> {
                System.out.println("Ingrese el nombre del cliente");
                c1.setNomc(tcl.next());
                System.out.println("Ingrese el correo del cliente");
                c1.setCorreo(tcl.next());
            }
            case 2 -> {
                System.out.println("Ingrese el nombre del propducto");
                cl1.setNom(tcl.next());
                System.out.println("Ingrese la marca del producto");
                cl1.setMar(tcl.next());
                System.out.println("Ingrese el precio del producto");
                cl1.setPre(tcl.nextInt());
                System.out.println("Ingrese la cantidad de Stock del producto");
                cl1.setStk(tcl.nextInt());
                System.out.println("Ingrese la capacidad de bateria");
                cl1.setBtr(tcl.next());
                System.out.println("Ingrese la cantidad de MP del dispositivo");
                cl1.setCam(tcl.nextInt());
            }
            case 3-> {
                System.out.println("Ingrese el nombre del producto");

            }




        }


    }
}