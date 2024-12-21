package org.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ActivaTest.class,
        MantenimientoTest.class,
        AlarmaTest.class
})
public class AllTests {
    // Clase vacía: sirve solo como punto de entrada para ejecutar todas las pruebas.
}
