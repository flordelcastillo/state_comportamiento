package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AlarmaTest {

    @Test
    public void testSetEstadoAndEjecutarAccion() {
        Alarma alarma = new Alarma();

        Estado activa = new Activa();
        Estado mantenimiento = new Mantenimiento();

        // Probar con el estado Activa
        alarma.setEstado(activa);
        try {
            alarma.ejecutarAccion();
            assertTrue(true);
        } catch (Exception e) {
            fail("Fallo en ejecutarAccion con estado Activa");
        }

        // Probar con el estado Mantenimiento
        alarma.setEstado(mantenimiento);
        try {
            alarma.ejecutarAccion();
            assertTrue(true);
        } catch (Exception e) {
            fail("Fallo en ejecutarAccion con estado Mantenimiento");
        }
    }
}
