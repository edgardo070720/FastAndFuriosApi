package com.example.FastAndFuriosApi.domain;

public interface IAbstractFactory {
    Chasis createChasis(int noEjes, int noPieza, String tipoTrasmision);
    Motor createMotor(int potenciaMax, int noPieza, String tecnologia);
    Cojineria createCojineria(int noPieza, String materialBaseFabrica);
    Vehiculo ensamblarVehiculo(int noEjes,int noPiezaCh, String tipoTrasmision,int potenciaMax,int noPiezaMo, String tecnologia,int noPiezaCo,String materialBaseFabrica,String color,String fechaEnsamblaje,int noEnsamblaje);
}
