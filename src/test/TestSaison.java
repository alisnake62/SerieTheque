package test;

import static org.junit.Assert.*;
import ClassObjects.Episode;
import ClassObjects.Saison;

import org.junit.Test;

import ClassObjects.Episode;
import ClassObjects.Saison;

public class TestSaison {

	@Test
	public void testDuree() {
		
		// On pr�pare le sc�nario de test
        Saison s1 = new Saison();
        s1.addEpisode(new Episode(1, 1, "Comme � la f�te foraine", 60));
        s1.addEpisode(new Episode(1, 1, "Comme � la f�te foraine", 40));
        
        // On v�rifie les r�sultats
        assertEquals( 100 /* Valeur attendue */, s1.getDureeTotale() /* Valeur constat�e */);
        
	}
	
	@Test
	public void testNbEpisode() {
		
		// On pr�pare le sc�nario de test
        Saison s1 = new Saison();
        s1.addEpisode(new Episode(1, 1, "Comme � la f�te foraine", 60));
        s1.addEpisode(new Episode(1, 1, "Comme � la f�te foraine", 40));
        
        // On v�rifie les r�sultats
        assertEquals( 2 /* Valeur attendue */, s1.getNbEpisode() /* Valeur constat�e */);
        
	}

	@Test
	public void testToString() {
		
		// On pr�pare le sc�nario de test
        Saison s1 = new Saison();
        s1.addEpisode(new Episode(1, 1, "Comme � la f�te foraine", 60));
        s1.addEpisode(new Episode(1, 2, "Toto � la montagne", 60));
        
        // On v�rifie les r�sultats
        assertEquals( "S1E1 : Comme � la f�te foraine\nS2E1 : Toto � la montagne\n" /* Valeur attendue */, s1.toString() /* Valeur constat�e */);
        
	}
	
}
