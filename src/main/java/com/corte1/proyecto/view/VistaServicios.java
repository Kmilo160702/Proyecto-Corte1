package com.corte1.proyecto.view;

import com.corte1.proyecto.controller.ControllerServicios;

import java.util.Scanner;

public class VistaServicios {

    public void menu() {
        System.out.println("\t____________Seleccione que servicio desea pagar___________\t");
        System.out.println("\t1. Agua\t");
        System.out.println("\t2. Luz\t");
        System.out.println("\t3. Gas\t");
        System.out.println("\t4. Salir\t");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1 -> {
                ControllerServicios controllerServicios = new ControllerServicios();
                controllerServicios.pagoAgua();
            }
            case 2 -> {
                ControllerServicios controllerServicios1 = new ControllerServicios();
                controllerServicios1.pagoLuz();
            }
            case 3 -> {
                ControllerServicios controllerServicios2 = new ControllerServicios();
                controllerServicios2.pagoGas();
            }
            case 4 -> {
                System.out.println("\tGracias por usar nuestros servicios\t");
                System.exit(0);
            }
            default -> {
                System.out.println("\tOpcion no valida\t");
                menu();
            }
        }
    }

}
