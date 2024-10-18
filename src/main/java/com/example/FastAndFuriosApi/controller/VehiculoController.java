package com.example.FastAndFuriosApi.controller;

import com.example.FastAndFuriosApi.domain.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VehiculoController {
    @GetMapping("/{marca}")
    public Vehiculo getVehiculo(@PathVariable String marca) {
        IAbstractFactory factory= getMarcaVehiculo(marca);
        Vehiculo vehiculo=factory.ensamblarVehiculo(2,5,"mecanica",50,20,"hibrido",7,"cuero","gris","24/06/2024",518);
        return vehiculo;
    }

    private IAbstractFactory getMarcaVehiculo(String marca) {
        if(marca.equals("toyota")){
            return new FactoryToyota();
        }
        if(marca.equals("mazda")){
            return new FactoryMazda();
        }
        if(marca.equals("ford")){
            return new FactoryFord();
        }
        return null;
    }
}
