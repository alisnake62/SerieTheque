package ClassObjects;

import java.util.ArrayList;
import java.io.Serializable;

public class Serie implements Serializable {

	private static final long serialVersionUID = 1855740869716533536L;
	private int id;
	private String titre;
	private ArrayList<Saison> listeSaisons;
	
	
	public Serie(int id, String titre) {
		this.listeSaisons = new ArrayList<Saison>();
		this.id = id;
		this.titre = titre;
	}
	
	public void addSaison(Saison saison) {
		this.listeSaisons.add(saison);
	}


	public int getId() {
		return id;
	}


	public String getTitre() {
		return titre;
	}


	public int getDureeTotale() {
		int rtrDuree = 0;
		for (int i = 0; i < this.listeSaisons.size(); i++) {
			rtrDuree += this.listeSaisons.get(i).getDureeTotale();
		}
		return rtrDuree;
	}
	
	public int getNbEpisode() {
		int rtrNbEpisode = 0;
		for (int i = 0; i < this.listeSaisons.size(); i++) {
			rtrNbEpisode += this.listeSaisons.get(i).getNbEpisode();
		}
		return rtrNbEpisode;
	}
	
	public int getNbSaisons() {
		return this.listeSaisons.size();
	}

	public String toString() {
		String rtrString = "";
		rtrString += "id : " + this.getId() + "\n";
		rtrString += "Titre : " + this.getTitre() + "\n";
		rtrString += "Duree : " + this.getDureeTotale() + "\n";
		rtrString += "Nb Saisons : " + this.getNbSaisons() + "\n";
		rtrString += "Nb Episodes : " + this.getNbEpisode() + "\n";
		return rtrString;
	}
	
	public String toStringLarge() {
		String rtrString = this.toString();
		for (int i = 0; i < this.listeSaisons.size(); i++) {
			rtrString += this.listeSaisons.get(i).toString();
		}
		return rtrString;
	}


	
}
