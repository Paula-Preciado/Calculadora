/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.calculadora__pau;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import javax.swing.JLabel;

/**
 *
 * @author Ryzen
 */
public class FrmCalculadoraTest {
    
    public FrmCalculadoraTest() {
    }

    private FrmCalculadora calculadora;

@Before
    public void setUp() {
        calculadora = new FrmCalculadora();
        calculadora.getTxtOperacion().setText(""); // Establece el texto en el campo de operación a vacío antes de cada prueba
    }

@Test
public void testAddNumero() {
    FrmCalculadora calculadora = new FrmCalculadora();
    calculadora.getTxtOperacion().setText(""); // Establece el texto en el campo de operación a vacío antes de cada prueba
    assertEquals("", calculadora.getTxtOperacion().getText());

    calculadora.addNumero("1");
    assertEquals("1", calculadora.getTxtOperacion().getText());

    calculadora.addNumero("2");
    assertEquals("12", calculadora.getTxtOperacion().getText());
}


   @Test
    public void testEntero() {
        FrmCalculadora calculadora = new FrmCalculadora();

        // Prueba un número entero positivo
        String resultado = calculadora.entero(10.0F);
        assertEquals("10", resultado);

        // Prueba un número entero negativo
        resultado = calculadora.entero(-5.0F);
        assertEquals("-5", resultado);

        // Prueba un número con parte decimal
        resultado = calculadora.entero(8.75F);
        assertEquals("8.75", resultado);

        // Prueba un número con parte decimal que debería ser truncada
        resultado = calculadora.entero(15.0F);
        assertEquals("15", resultado);

        // Prueba un número con parte decimal que no debería ser truncada
        resultado = calculadora.entero(2.5F);
        assertEquals("2.5", resultado);


    }

@Test
    public void testCalcularPotencia() {
        // Prueba la potencia de un número positivo
        float resultado = FrmCalculadora.calcularPotencia(2.0F, 3.0F);
        assertEquals(8.0F, resultado, 0);

        // Prueba la potencia de un número negativo
        resultado = FrmCalculadora.calcularPotencia(-2.0F, 3.0F);
        assertEquals(-8.0F, resultado, 0);

        // Prueba la potencia de 0 elevado a un número positivo
        resultado = FrmCalculadora.calcularPotencia(0.0F, 5.0F);
        assertEquals(0.0F, resultado, 0);

        // Prueba la potencia de 0 elevado a 0
        resultado = FrmCalculadora.calcularPotencia(0.0F, 0.0F);
        assertEquals(1.0F, resultado, 0);

        // Prueba la potencia de un número positivo elevado a 0
        resultado = FrmCalculadora.calcularPotencia(5.0F, 0.0F);
        assertEquals(1.0F, resultado, 0);

        // Prueba la potencia de un número negativo elevado a un número impar
        resultado = FrmCalculadora.calcularPotencia(-2.0F, 5.0F);
        assertEquals(-32.0F, resultado, 0);

        // Prueba la potencia de un número con parte decimal
        resultado = FrmCalculadora.calcularPotencia(1.5F, 2.0F);
        assertEquals(2.25F, resultado, 0);
    }
    
    @Test
    public void testGetTxtOperacion() {
        FrmCalculadora calculadora = new FrmCalculadora();
        JLabel txtOperacion = calculadora.getTxtOperacion();

        // Verifica que el objeto devuelto por getTxtOperacion sea el mismo que el objeto en la instancia de FrmCalculadora
        assertEquals(calculadora.getTxtOperacion(), txtOperacion);
    }
    
}
