package ClassObjects;

import java.util.HashMap;
import java.io.Serializable;

public class Collection implements Serializable{
	
	private static final long serialVersionUID = 1855740869716533536L;
	private String name;
	private HashMap<Integer, Serie> listeSerie;
	
	public Collection(String name) {
		this.name = name;
		this.listeSerie = new HashMap<Integer, Serie>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addSerie(Serie serie) {
		this.listeSerie.put(serie.getId(), serie);
	}

	public int getDureeTotale() {
		int rtrDuree = 0;
		
		for (int i : this.listeSerie.keySet()) {
			rtrDuree += this.listeSerie.get(i).getDureeTotale();
		}
		return rtrDuree;
	}
	
	public int getNbEpisode() {
		int rtrNbEpisode = 0;
		
		for (int i : this.listeSerie.keySet()) {
			rtrNbEpisode += this.listeSerie.get(i).getNbEpisode();
		}
		return rtrNbEpisode;
	}
	
	public int getNbSeries() {
		return this.listeSerie.size();
	}
	
	public int getNbSaisons() {
		int rtrNbSaisons = 0;
		for (int i : this.listeSerie.keySet()) {
			rtrNbSaisons += this.listeSerie.get(i).getNbSaisons();
		}
		return rtrNbSaisons;
	}

	public Serie getSerie(int id) {
		return this.listeSerie.get(id);
	}
	
	public Collection getSeries() {
		return this;
	}
	
	public String toString() {
		String rtrString = "";
		for (int i : this.listeSerie.keySet()) {
			rtrString += this.listeSerie.get(i).toString() + "\n";
		}
		return rtrString;
	}

}
