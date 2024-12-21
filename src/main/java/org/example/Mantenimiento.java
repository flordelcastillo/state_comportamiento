package org.example;

public class Mantenimiento implements Estado{
    @Override
    public void ejecutarAccion(){
        System.out.println("Estado Mantenimiento: No atento");
        System.out.println("Enviar correo para informar el estado");
    }
}