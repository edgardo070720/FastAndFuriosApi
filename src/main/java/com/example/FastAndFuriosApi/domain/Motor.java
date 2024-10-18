package com.example.FastAndFuriosApi.domain;

public abstract class Motor {
    private int potenciaMax;
    private int noPieza;
    private String  tecnologia;

    public Motor(int potenciaMax, int noPieza, String tecnologia) {
        this.potenciaMax = potenciaMax;
        this.noPieza = noPieza;
        this.tecnologia = tecnologia;
    }

    public int getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    public int getNoPieza() {
        return noPieza;
    }

    public void setNoPieza(int noPieza) {
        this.noPieza = noPieza;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
}
