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
                6. Salir
                
                """);
        opc = tcl.nextInt();
        switch (opc) {

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

            case 3 -> {
                System.out.println("Ingrese el nombre del producto:");
                l1.setNom(tcl.next());
                System.out.println("Ingrese la marca del producto:");
                l1.setMar(tcl.next());
                System.out.println("Ingrese el precio del producto:");
                l1.setPre(tcl.nextInt());
                System.out.println("Ingrese la cantidad de stock:");
                l1.setStk(tcl.nextInt());
                System.out.println("Ingrese el procesador:");
                l1.setPros(tcl.next());
                System.out.println("Ingrese la RAM (GB):");
                l1.setRAM(tcl.next());
            }

            case 4 -> {
                if (cl1 == null || (cl1 == null && l1 == null)) {
                    System.out.println("Se debe crear almenos un cliente o producto para hacer la compra");
                    break;
                }
                System.out.println("Ingrese cantidad de celulares que va a comprar");
                int cantCel = tcl.nextInt();
                if (cl1 != null) c1.comPrd(cl1, cantCel);

                System.out.println("Ingrese la cantidad de Laptops que va a comprar");
                int cantLpt = tcl.nextInt();
                if (l1 != null) c1.comPrd(l1, cantLpt);
            }

            case 5 -> {
                if (c1 != null) {

                    c1.mostCmp();

                    if (c1 != null) l1.mostDet();
                    if (cl1 != null) cl1.mostDet();
                } else {
                    System.out.println("No hay cliente registrado");
                }


            }
            case 6 -> {
                System.out.println("Saliendo del programa");
            }
            default -> {
                System.out.println("Opción invalida");
            }
        }while (opc!=6);
    }
}