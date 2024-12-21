package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ActivaTest {

    @Test
    public void testEjecutarAccion() {
        Activa activa = new Activa();
        activa.ejecutarAccion();
        // No hay retorno que verificar, pero observamos que no lanza excepciones.
        assertTrue(true); // Placeholder para validar que el método no lanza errores.
    }
}
