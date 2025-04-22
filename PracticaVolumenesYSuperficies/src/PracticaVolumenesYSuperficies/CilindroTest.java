package PracticaVolumenesYSuperficies;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CilindroTest {

	@Test
	void testSuperficie() {
		 Cilindro cilindro1 = new Cilindro();
	        //Calculamos la superficie que nos da el metodo
	        double superficieObtenida = cilindro1.superficie();
	        
	        //Hardcodeamos la superficie que sabemos que debe dar
	        double superficieEsperada = 12.56;
	        assertEquals(superficieEsperada, superficieObtenida);
	}

	@Test
	void testVolumen() {
		  Cilindro cilindro1 = new Cilindro();
		    //Calculamos el volumen que nos da el metodo
		    double volumenObtenido = cilindro1.volumen();
		    
		    //Hardcodeamos el volumen que sabemos que debe dar
		    double volumenEsperado = 3.14;
		    assertEquals(volumenEsperado, volumenObtenido);
	}

}
