package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ClassObjects.Episode;
import ClassObjects.Saison;

public class TestEpisode {

	@Test
	public void testDuree() {
		
		// On prépare le scénario de test
        Episode e1 = new Episode(1, 1, "Comme à la fête foraine", 60);
        
        
        // On vérifie les résultats
        assertEquals( 60 /* Valeur attendue */, e1.getDuree() /* Valeur constatée */);
        
	}

}
