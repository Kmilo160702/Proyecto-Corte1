package com.corte1.proyecto.controller;

import com.corte1.proyecto.model.Servicios;
import com.corte1.proyecto.test.Test;
import com.corte1.proyecto.view.VistaServicios;

import java.util.Timer;
import java.util.TimerTask;

public class ControllerServicios {

    private double valorPago;

    private Servicios modelo;
    private VistaServicios vista;

    public Servicios getModelo() {
        return modelo;
    }

    public void setModelo(Servicios modelo) {
        this.modelo = modelo;
    }

    public VistaServicios getVista() {
        return vista;
    }

    public void setVista(VistaServicios vista) {
        this.vista = vista;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public void volver() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                VistaServicios vPrueba = new VistaServicios();
                vPrueba.menu();
            }
        };
        timer.schedule(task, 5000);
    }

    public void pagoAgua() {
        modelo = Test.obtenerDatos();
        switch (modelo.getEstrato()) {
            case 1, 2 -> {
                setValorPago(modelo.getValorAgua() * modelo.getConsumo());
                setValorPago(getValorPago() - (getValorPago() * 0.5));
                setValorPago(getValorPago() + (getValorPago() * 0.01));
                System.out.println("\tEl valor a pagar es: \t" + getValorPago());
                volver();
            }
            case 3, 4 -> {
                setValorPago(modelo.getValorAgua() * modelo.getConsumo());
                setValorPago(getValorPago() - (getValorPago() * 0.1));
                setValorPago(getValorPago() + (getValorPago() * 0.01));
                System.out.println("\tEl valor a pagar es: \t" + getValorPago());
                volver();
            }
            case 5, 6 -> {
                setValorPago(modelo.getValorAgua() * modelo.getConsumo());
                setValorPago(getValorPago() - (getValorPago() * 0.25));
                setValorPago(getValorPago() + (getValorPago() * 0.01));
                System.out.println("\tEl valor a pagar es: \t" + getValorPago());
                volver();
            }
            default -> {
                System.out.println("\tEl estrato ingresado no es valido\t");
                volver();
            }
        }
    }

    public void pagoLuz() {
        modelo = Test.obtenerDatos();
        switch (modelo.getEstrato()) {
            case 1, 2 -> {
                setValorPago(modelo.getValorLuz() * modelo.getConsumo());
                setValorPago(getValorPago() - (getValorPago() * 0.5));
                setValorPago(getValorPago() + (getValorPago() * 0.01));
                System.out.println("\tEl valor a pagar es: " + getValorPago());
                volver();
            }
            case 3, 4 -> {
                setValorPago(modelo.getValorLuz() * modelo.getConsumo());
                setValorPago(getValorPago() - (getValorPago() * 0.1));
                setValorPago(getValorPago() + (getValorPago() * 0.01));
                System.out.println("\tEl valor a pagar es: " + getValorPago());
                volver();
            }
            case 5, 6 -> {
                setValorPago(modelo.getValorLuz() * modelo.getConsumo());
                setValorPago(getValorPago() - (getValorPago() * 0.25));
                setValorPago(getValorPago() + (getValorPago() * 0.01));
                System.out.println("\tEl valor a pagar es: " + getValorPago());
                volver();
            }
            default -> {
                System.out.println("\tEl estrato ingresado no es valido");
                volver();
            }
        }
    }

    public void pagoGas() {
        modelo = Test.obtenerDatos();
        switch (modelo.getEstrato()) {
            case 1, 2 -> {
                setValorPago(modelo.getValorGas() * modelo.getConsumo());
                setValorPago(getValorPago() - (getValorPago() * 0.5));
                setValorPago(getValorPago() + (getValorPago() * 0.01));
                System.out.println("\tEl valor a pagar es: " + getValorPago());
                volver();
            }
            case 3, 4 -> {
                setValorPago(modelo.getValorGas() * modelo.getConsumo());
                setValorPago(getValorPago() - (getValorPago() * 0.1));
                setValorPago(getValorPago() + (getValorPago() * 0.01));
                System.out.println("\tEl valor a pagar es: " + getValorPago());
                volver();
            }
            case 5, 6 -> {
                setValorPago(modelo.getValorGas() * modelo.getConsumo());
                setValorPago(getValorPago() - (getValorPago() * 0.25));
                setValorPago(getValorPago() + (getValorPago() * 0.01));
                System.out.println("\tEl valor a pagar es: " + getValorPago());
                volver();
            }
            default -> {
                System.out.println("\tEl estrato ingresado no es valido");
                volver();
            }
        }
    }
}
