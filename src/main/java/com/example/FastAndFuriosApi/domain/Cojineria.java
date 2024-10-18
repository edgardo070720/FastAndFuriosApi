package com.example.FastAndFuriosApi.domain;

public abstract class Cojineria {
    private int noPieza;
    private String materiaBaseFabrica;

    public Cojineria(int noPieza, String materiaBaseFabrica) {
        this.noPieza = noPieza;
        this.materiaBaseFabrica = materiaBaseFabrica;
    }

    public int getNoPieza() {
        return noPieza;
    }

    public void setNoPieza(int noPieza) {
        this.noPieza = noPieza;
    }

    public String getMateriaBaseFabrica() {
        return materiaBaseFabrica;
    }

    public void setMateriaBaseFabrica(String materiaBaseFabrica) {
        this.materiaBaseFabrica = materiaBaseFabrica;
    }
}
