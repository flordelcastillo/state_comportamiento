package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de la alarma
        Alarma alarma = new Alarma();

        // Crear los diferentes estados
        Estado estadoActivo = new Activa();
        Estado estadoMantenimiento = new Mantenimiento();

        // Configurar la alarma al estado activo y ejecutar acción
        System.out.println("Cambiando al estado Activo:");
        alarma.setEstado(estadoActivo);
        alarma.ejecutarAccion();

        // Cambiar la alarma al estado de mantenimiento y ejecutar acción
        System.out.println("\nCambiando al estado de Mantenimiento:");
        alarma.setEstado(estadoMantenimiento);
        alarma.ejecutarAccion();
    }
}
