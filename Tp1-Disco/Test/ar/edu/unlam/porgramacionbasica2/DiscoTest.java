package ar.edu.unlam.porgramacionbasica2;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.programacionbasica2.Disco;

public class DiscoTest {
 @Test
 	public void testParaObtenerElPerimetroInterior(){
	 Disco Disco1 = new Disco();
	 Disco1.setRadioInterior(8.00);
	 Double perimetroEsperado= 50.24;
	 assertEquals(perimetroEsperado, Disco1.obtenerPerimetroInterior(),0.1);
 }
 
 @Test 
 
 public void testParaObtenerElPerimetroExterior(){
	 Disco Disco2 = new Disco();
	 Disco2.setRadioExterior(12.00);
	 Double perimetroEsperado= 75.36;
	 assertEquals(perimetroEsperado, Disco2.obtenerPerimetroExterior(),0.1);
 }
 
 @Test
 
 public void testParaObtenerLaSuperficie(){
	 Disco Disco3= new Disco();
	 Disco3.setRadioInterior(5.00);
	 Disco3.setRadioExterior(10.00);
	 Double superficieEsperada = 235.6;
	 assertEquals(superficieEsperada, Disco3.obtenerSuperficie(),0.1);
 }
}
