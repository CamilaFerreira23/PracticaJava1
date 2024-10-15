/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author Cfp23
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               Empleado empleado = new Empleado("Dennia","Rosario","Femenino", "Calle consagracion 162", "829-736-8562", "Diseñadora web", 5);
        Cliente cliente = new Cliente("Priscilla Aimee","Morillo Tejada","Tortuga", "Calle penetracion", "809-374-9319", "Psicologa");

        
        int opcion = 0;
      
            System.out.println("-----------------------------------------------");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Solicitar permiso (Empleado)");
            System.out.println("2. Reportar horas extra (Empleado)");
            System.out.println("3. Contactar representante (Cliente)");
            System.out.println("4. Solicitar información (Cliente)");
            System.out.println("5. Salir");
            System.out.println("------------------------------------------------");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(empleado.solicitudPermiso());
                    break;
                case 2:
                    System.out.println(empleado.reporteHorasExtra());
                    break;
                case 3:
                    System.out.println(cliente.contactarRepresentante());
                    break;
                case 4:
                    System.out.println(cliente.solicitarInformacion());
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
 }
}
    

