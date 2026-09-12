import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        int opcion = 0;

        do{
            System.out.println("\n--- SISTEMA DE GESTION DE EMPLEADOS ---");
            System.out.println("1. Agregar Empleado a Tiempo Completo");
            System.out.println("2. Agregar Empleado por Horas");
            System.out.println("3. Agregar Empleado Contratista");
            System.out.println("4. Agregar Empleado a Comision");
            System.out.println("5. Listar Empleados y Pago Totales");
            System.out.println("6. Salir");
            System.out.print(">>");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    System.out.print("Nombre: ");
                    String nombreETC = teclado.nextLine();
                    System.out.print("Sueldo Basico: ");
                    int sueldoBasico = teclado.nextInt();
                    System.out.print("Años de Antiguedad: ");
                    int antiguedad = teclado.nextInt();

                    listaEmpleados.add(new EmpleadoTiempoCompleto(nombreETC, sueldoBasico, antiguedad));
                    System.out.println("Agregado Empleado a Tiempo Completo exitosamente!");
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nombreEH = teclado.nextLine();
                    System.out.print("Horas trabajadas: ");
                    int horasTrabajadas = teclado.nextInt();
                    System.out.print("Precio por hora: ");
                    double precioHoras = teclado.nextDouble();

                    listaEmpleados.add(new EmpleadoPorHoras(nombreEH, horasTrabajadas, precioHoras));
                    System.out.println("Agregado Empleado Por Horas exitosamente!");
                    break;

                case 3:
                    System.out.print("Nombre: ");
                    String nombreEC = teclado.nextLine();
                    System.out.print("Horas trabajadas en el proyecto: ");
                    int horasTrabajadasEn = teclado.nextInt();
                    System.out.print("Tarifa por hora del proyecto: ");
                    double tarifaHoras = teclado.nextDouble();

                    listaEmpleados.add(new EmpleadoContratista(nombreEC, horasTrabajadasEn, tarifaHoras));
                    System.out.println("Agregado Empleado Contratista exitosamente!");
                    break;

                case 4:
                    System.out.print("Nombre: ");
                    String nombreECo = teclado.nextLine();
                    System.out.print("Clientes captados: ");
                    int captado = teclado.nextInt();
                    System.out.print("Comision por cliente: ");
                    double comisionPorCliente = teclado.nextDouble();

                    listaEmpleados.add(new EmpleadoAcomision(nombreECo, captado, comisionPorCliente));
                    System.out.println("Agregado Empleado Acomision exitosamente!");
                    break;

                case 5:
                    if(listaEmpleados.isEmpty()){
                        System.out.println("No hay empleados registrados en el sistema.");
                    }else{
                        System.out.println("\n--- LISTADO DE EMPLEADOS Y PAGOS ---");
                        for (Empleado emp : listaEmpleados) {
                            System.out.println("Empleado: " + emp.getNombre() +
                                    " | Tipo: " + emp.getClass().getSimpleName() +
                                    " | Pago final: $" + emp.calcularPago());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
        }while(opcion != 6);

        teclado.close();
    }

}
