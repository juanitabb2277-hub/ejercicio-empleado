import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Empleado> lstEmpleados = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        EmpleadoAdministrativo ea1 = new EmpleadoAdministrativo(18, "Juanita", 3200000, 120000);
        EmpleadoVentas ev1 = new EmpleadoVentas(20, "Nataly", 35000000, 6, 3600000);
        Empleadohoras eh1 = new Empleadohoras(20, "paula", 1600000, 5, 170000);
        lstEmpleados.add(ea1);
        lstEmpleados.add(ev1);
        lstEmpleados.add(eh1);
        int opcion;
        String respuesta;
        do{
            System.out.println("-----BIENVENIDO A EMPRESA DE JUANITA------");
            System.out.println("1.Crear Empleado Administrativo,2.Crear Empleado ventas,3.Crear Empleado por horas");
            System.out.println("4.Mostrar informacion");
            System.out.println("5.Buscar Empleado");
            System.out.println("6.Saliendo del programa");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    teclado.nextLine();
                    System.out.println("Nombre:");
                    String nombre = teclado.nextLine();

                    System.out.println("Edad:");
                    int edad = teclado.nextInt();

                    System.out.println("Salario base:");
                    double salarioBase = teclado.nextDouble();

                    System.out.println("Bonificacion:");
                    double bonificacion = teclado.nextDouble();

                    lstEmpleados.add(new EmpleadoAdministrativo(edad,nombre, salarioBase, bonificacion));
                    System.out.println("Empleado creado correctamente.");
                    break;
                case 2:
                    teclado.nextLine();
                    System.out.println("Nombre:");
                    String nombre1 = teclado.nextLine();

                    System.out.println("Edad:");
                    int edad1 = teclado.nextInt();

                    System.out.println("Salario base:");
                    double salarioBase1 = teclado.nextDouble();

                    System.out.println("Comision:");
                    double comision = teclado.nextDouble();

                    System.out.println("Total de ventas: ");
                    double totaldeventas = teclado.nextDouble();

                    lstEmpleados.add(new EmpleadoVentas(edad1,nombre1, salarioBase1,comision,totaldeventas));
                    System.out.println("Empleado creado correctamente.");
                    break;
                case 3:
                    teclado.nextLine();
                    System.out.println("Nombre:");
                    String nombre2 = teclado.nextLine();

                    System.out.println("Edad:");
                    int edad2 = teclado.nextInt();

                    System.out.println("Salario base:");
                    double salarioBase2 = teclado.nextDouble();

                    System.out.println("Horas Trabajadas:");
                    int horastrabajadas = teclado.nextInt();

                    System.out.println("Valor de hora: ");
                    double valordehora = teclado.nextDouble();

                    lstEmpleados.add(new Empleadohoras(edad2,nombre2, salarioBase2,horastrabajadas,valordehora));
                    System.out.println("Empleado creado correctamente.");
                    break;
                case 4:
                    for (Empleado e : lstEmpleados) {
                        System.out.println("----- INFORMACIÓN DEL EMPLEADO -----");
                        e.mostrarInfo();
                        System.out.println();
                    }
                    break;
                case 5:
                    teclado.nextLine();
                    System.out.println("Ingrese el nombre del empleado a buscar:");
                    String nombreBuscar = teclado.nextLine();
                    boolean encontrado = false;
                    for (Empleado e : lstEmpleados) {
                        if (e.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            System.out.println("Empleado encontrado:");
                            e.mostrarInfo();
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró un empleado con ese nombre.");
                    }

                    break;
                case 6:
                    System.out.println("SALIENDO DEL PROGRAMA");
                default:
                    System.out.println("NO EXISTE ESA OPCION");



            }


        }while (opcion != 6);



    }
}