package PracticaVolumenesYSuperficies;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuboTest {

	@Test
	void testSuperficie() {
		 Cubo cubo1 = new Cubo();
		    //Calculamos la superficie que nos da el metodo
		    int superficieObtenida = cubo1.superficie();
		    
		    //Hardcodeamos la superficie que sabemos que debe dar
		    int superficieEsperada = 6;
		    assertEquals(superficieEsperada, superficieObtenida);
	}

	@Test
	void testVolumen() {
		 Cubo cubo1 = new Cubo();
		    //Calculamos el volumen que nos da el metodo
		    int volumenObtenido = cubo1.volumen();
		    
		    //Hardcodeamos el volumen que sabemos que debe dar
		    int volumenEsperado = 1;
		    assertEquals(volumenEsperado, volumenObtenido);
	}

}
