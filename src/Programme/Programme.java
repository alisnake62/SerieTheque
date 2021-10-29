package Programme;
//test2
import ClassObjects.Collection;
import ClassObjects.Episode;
import ClassObjects.Saison;
import ClassObjects.Serie;

import java.io.File;
import java.util.Scanner;

public class Programme {

	public static String screenProgram() {
		String rtrString = "";
		rtrString += "******************\n";
		rtrString += "* Ma Serietheque *\n";
		rtrString += "******************\n";
		rtrString += "s : Statistiques\n";
		
		rtrString += "l : Liste des s�ries\n";
		rtrString += "d : D�tail d'une s�rie\n";
		rtrString += "r : Rechercher une s�rie\n";
		rtrString += "a : Ajouter une s�rie\n";
		rtrString += "q : Quitter l'application\n";
		rtrString += "Choisir une option :";
		return rtrString;
	}
	
	public static Collection exempleData() {
		Collection maCollection = new Collection("maCollection");
		Serie x = new Serie(87739, "Le Jeu de la dame");

		Saison s = new Saison();
		s.addEpisode(new Episode(1, 1, "Ouvertures", 60));
		s.addEpisode(new Episode(1, 2, "�changes", 60));
		s.addEpisode(new Episode(1, 3, "Pions doubl�s", 60));
		s.addEpisode(new Episode(1, 4, "Milieu de jeu", 60));
		s.addEpisode(new Episode(1, 5, "Fourchette", 60));
		s.addEpisode(new Episode(1, 6, "Ajournement", 60));
		s.addEpisode(new Episode(1, 7, "Finale", 60));

		x.addSaison(s);
		
		maCollection.addSerie(x);

		// ------ Deuxi�me s�rie
		x = new Serie(76479, "The Boys");
		s = new Saison();
		s.addEpisode(new Episode(1, 1, "La R�gle du jeu", 60));
		s.addEpisode(new Episode(1, 2, "Cerise", 60));
		s.addEpisode(new Episode(1, 3, "Prends �a", 60));
		s.addEpisode(new Episode(1, 4, "La Fille", 60));
		s.addEpisode(new Episode(1, 5, "Des bleus � l'�me", 60));
		s.addEpisode(new Episode(1, 6, "Les Innocents", 60));
		s.addEpisode(new Episode(1, 7, "Question de survie", 60));
		s.addEpisode(new Episode(1, 8, "On ne prend plus de gants", 60));
		x.addSaison(s);

		s = new Saison();
		s.addEpisode(new Episode(1, 1, "Comme � la f�te foraine", 60));
		s.addEpisode(new Episode(1, 2, "Pr�paration propre et planification", 60));
		s.addEpisode(new Episode(1, 3, "La Charge de la brigade l�g�re", 60));
		s.addEpisode(new Episode(1, 4, "Rien de tel dans le monde entier", 60));
		s.addEpisode(new Episode(1, 5, "Quand faut y aller, faut y aller", 60));
		s.addEpisode(new Episode(1, 6, "On ne prend plus de gants", 60));
		s.addEpisode(new Episode(1, 7, "Le Fils du boulanger", 60));
		s.addEpisode(new Episode(1, 8, "Les Innocents", 60));
		x.addSaison(s);

		maCollection.addSerie(x);
		
		return maCollection;
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Storage storage = new Storage();
		Collection maCollection = new Collection("maCollection");
		
		//manually input of data if file not exist
		File fichier = new File("maCollection.ser");
		if(fichier.isFile())
		{ 
			maCollection = storage.Deserialisation("maCollection.ser");
		}else {
			maCollection = exempleData();
		}
		
		//game loop
		
		String saisie;
		Scanner scanner = new Scanner( System.in );
		
		int test = 0;
		while(true) {
			System.out.println(screenProgram());
			saisie = scanner.nextLine().toLowerCase();
			
			if (saisie.equals("q")) {
				break;
			}
			
			else if (saisie.equals("s")) {
				String str = "";
				str += "Nombre de s�ries : " + maCollection.getNbSeries() + "\n";
				str += "Nombre de saisons : " + maCollection.getNbSaisons() + "\n";
				str += "Nombre d'�pisodes : " + maCollection.getNbEpisode() + "\n";
				str += "Dur�e totale : " + maCollection.getDureeTotale() + " minutes\n";
				System.out.println(str);
			}
			
			else if (saisie.equals("l")){
				System.out.println(maCollection);
			}
			
			else if (saisie.equals("d")){
				System.out.println("Quel est l'id de la s�rie ?");
				int saisieId = scanner.nextInt();
				System.out.println(maCollection.getSerie(saisieId).toStringLarge());
			}
			
			else if (saisie.equals("r")){
				System.out.println("recherche (Todo)");
			}
			
			else if (saisie.equals("a")){
				System.out.println("Quel est l'id de la nouvelle s�rie ?");
				String saisieId = scanner.nextLine();
				System.out.println("Quel est le nom de la nouvelle s�rie ?");
				String saisieTitre = scanner.nextLine();
				maCollection.addSerie(new Serie(Integer.parseInt(saisieId), saisieTitre));
			}
			
			else {
				System.out.println("Saisie Erron�e");
			}
		}
		System.out.println("Merci et Aurevoir");
		
		//register in file
		storage.Serialisation(maCollection);
	}
		
		

}