package com.example.FastAndFuriosApi.domain;

public class Vehiculo {
    private String color;
    private String fechaEnsamblaje;
    private int noEnsamblaje;
    private Motor motor;
    private Chasis chasis;
    private Cojineria cojineria;

    public Vehiculo(String color, String fechaEnsamblaje, int noEnsamblaje, Motor motor, Chasis chasis, Cojineria cojineria) {
        this.color = color;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.noEnsamblaje = noEnsamblaje;
        this.motor = motor;
        this.chasis = chasis;
        this.cojineria = cojineria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public void setFechaEnsamblaje(String fechaEnsamblaje) {
        this.fechaEnsamblaje = fechaEnsamblaje;
    }

    public int getNoEnsamblaje() {
        return noEnsamblaje;
    }

    public void setNoEnsamblaje(int noEnsamblaje) {
        this.noEnsamblaje = noEnsamblaje;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Cojineria getCojineria() {
        return cojineria;
    }

    public void setCojineria(Cojineria cojineria) {
        this.cojineria = cojineria;
    }
}
