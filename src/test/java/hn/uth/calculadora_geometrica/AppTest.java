package hn.uth.calculadora_geometrica;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest
{
    @Test
    public void testCalcularAreaCirculo() {
        assertEquals(28.27, App.calcularAreaCirculo(3), 0.01);
    }

    @Test
    public void testCalcularAreaCirculoTrue() {
        assertTrue(App.calcularAreaCirculo(3) > 0); 
    }

    @Test
    public void testCalcularAreaCirculoFalse() {
        assertFalse(App.calcularAreaCirculo(0) > 0);
    }

    //calcularAreaCuadrado
    @Test
    public void testCalcularAreaCuadrado() {
        assertEquals(9.0, App.calcularAreaCuadrado(3), 0.01);
    }

    @Test
    public void testCalcularAreaCuadradoNotEquals() {
        assertNotEquals(16.0, App.calcularAreaCuadrado(3), 0.01);
    }

    @Test
    public void testCalcularAreaCuadradoTrue() {
        assertTrue(App.calcularAreaCuadrado(4) == 16.0);
    }

    //calcularAreaRectangulo
    @Test
    public void testCalcularAreaRectangulo() {
        assertEquals(12.0, App.calcularAreaRectangulo(3, 4), 0.01);
    }

    @Test
    public void testCalcularAreaRectanguloNotEquals() {
        assertNotEquals(20.0, App.calcularAreaRectangulo(3, 4), 0.01);
    }

    @Test
    public void testCalcularAreaRectanguloTrue() {
        assertTrue(App.calcularAreaRectangulo(5, 6) == 30.0);
    }

    //calcularAreaTriangulo
    @Test
    public void testCalcularAreaTriangulo() {
        assertEquals(6.0, App.calcularAreaTriangulo(3, 4), 0.01);
    }

    @Test
    public void testCalcularAreaTrianguloFalse() {
        assertFalse(App.calcularAreaTriangulo(3, 4) == 10.0);
    }

    @Test
    public void testCalcularAreaTrianguloTrue() {
        assertTrue(App.calcularAreaTriangulo(5, 6) == 15.0);
    }
}
