package com.corte1.proyecto.model;

public class Servicios {

    private int estrato;
    private int consumo;
    private int valorAgua = 9256;
    private int valorLuz = 6200;
    private int valorGas = 5234;

    public Servicios() {
    }

    public Servicios(int estrato, int consumo) {
        this.estrato = estrato;
        this.consumo = consumo;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getValorAgua() {
        return valorAgua;
    }

    public void setValorAgua(int valorAgua) {
        this.valorAgua = valorAgua;
    }

    public int getValorLuz() {
        return valorLuz;
    }

    public void setValorLuz(int valorLuz) {
        this.valorLuz = valorLuz;
    }

    public int getValorGas() {
        return valorGas;
    }

    public void setValorGas(int valorGas) {
        this.valorGas = valorGas;
    }

}
