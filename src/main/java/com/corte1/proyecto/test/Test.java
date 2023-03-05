package com.corte1.proyecto.test;

import com.corte1.proyecto.model.Servicios;
import com.corte1.proyecto.view.VistaServicios;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Test {

    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
        VistaServicios vPrueba = new VistaServicios();
        vPrueba.menu();
    }

    public static Servicios obtenerDatos() {
        Servicios servicios = new Servicios();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tIngrese el estrato:\t");
        servicios.setEstrato(scanner.nextInt());
        System.out.print("\tIngrese el consumo:\t");
        servicios.setConsumo(scanner.nextInt());

        return servicios;
    }
}
