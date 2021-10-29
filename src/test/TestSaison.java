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
		
		// On prépare le scénario de test
        Saison s1 = new Saison();
        s1.addEpisode(new Episode(1, 1, "Comme à la fête foraine", 60));
        s1.addEpisode(new Episode(1, 1, "Comme à la fête foraine", 40));
        
        // On vérifie les résultats
        assertEquals( 100 /* Valeur attendue */, s1.getDureeTotale() /* Valeur constatée */);
        
	}
	
	@Test
	public void testNbEpisode() {
		
		// On prépare le scénario de test
        Saison s1 = new Saison();
        s1.addEpisode(new Episode(1, 1, "Comme à la fête foraine", 60));
        s1.addEpisode(new Episode(1, 1, "Comme à la fête foraine", 40));
        
        // On vérifie les résultats
        assertEquals( 2 /* Valeur attendue */, s1.getNbEpisode() /* Valeur constatée */);
        
	}

	@Test
	public void testToString() {
		
		// On prépare le scénario de test
        Saison s1 = new Saison();
        s1.addEpisode(new Episode(1, 1, "Comme à la fête foraine", 60));
        s1.addEpisode(new Episode(1, 2, "Toto à la montagne", 60));
        
        // On vérifie les résultats
        assertEquals( "S1E1 : Comme à la fête foraine\nS2E1 : Toto à la montagne\n" /* Valeur attendue */, s1.toString() /* Valeur constatée */);
        
	}
	
}
