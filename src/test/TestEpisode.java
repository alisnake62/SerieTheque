package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ClassObjects.Episode;
import ClassObjects.Saison;

public class TestEpisode {

	@Test
	public void testDuree() {
		
		// On pr�pare le sc�nario de test
        Episode e1 = new Episode(1, 1, "Comme � la f�te foraine", 60);
        
        
        // On v�rifie les r�sultats
        assertEquals( 60 /* Valeur attendue */, e1.getDuree() /* Valeur constat�e */);
        
	}

}
