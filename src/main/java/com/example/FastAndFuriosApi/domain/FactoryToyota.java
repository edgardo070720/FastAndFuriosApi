package com.example.FastAndFuriosApi.domain;

public class FactoryToyota implements IAbstractFactory{
    @Override
    public Chasis createChasis(int noEjes, int noPieza, String tipoTrasmision) {
        return new ChasisToyota(noEjes, noPieza, tipoTrasmision);
    }

    @Override
    public Motor createMotor(int potenciaMax, int noPieza, String tecnologia) {
        return new MotorToyota(potenciaMax, noPieza, tecnologia);
    }

    @Override
    public Cojineria createCojineria(int noPieza, String materialBaseFabrica) {
        return new CojineriaToyota(noPieza, materialBaseFabrica);
    }

    @Override
    public Vehiculo ensamblarVehiculo(int noEjes, int noPiezaCh, String tipoTrasmision, int potenciaMax, int noPiezaMo, String tecnologia, int noPiezaCo, String materialBaseFabrica, String color, String fechaEnsamblaje, int noEnsamblaje) {
        return new Vehiculo(color,fechaEnsamblaje,noEnsamblaje,createMotor(potenciaMax,noPiezaMo,tecnologia),createChasis(noEjes,noPiezaCh,tipoTrasmision),createCojineria(noPiezaCo,materialBaseFabrica));
    }
}
