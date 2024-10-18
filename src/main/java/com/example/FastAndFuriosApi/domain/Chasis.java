package com.example.FastAndFuriosApi.domain;

public abstract class Chasis {
    private int noEjes;
    private int noPieza;
    private String tipoTrasmision;

    public Chasis(int noEjes, int noPieza, String tipoTrasmision) {
        this.noEjes = noEjes;
        this.noPieza = noPieza;
        this.tipoTrasmision = tipoTrasmision;
    }

    public int getNoEjes() {
        return noEjes;
    }

    public void setNoEjes(int noEjes) {
        this.noEjes = noEjes;
    }

    public int getNoPieza() {
        return noPieza;
    }

    public void setNoPieza(int noPieza) {
        this.noPieza = noPieza;
    }

    public String getTipoTrasmision() {
        return tipoTrasmision;
    }

    public void setTipoTrasmision(String tipoTrasmision) {
        this.tipoTrasmision = tipoTrasmision;
    }
}
