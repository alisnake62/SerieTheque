package ClassObjects;

import java.util.ArrayList;
import java.io.Serializable;

public class Saison implements Serializable {

	private static final long serialVersionUID = 1855740869716533536L;
	private ArrayList<Episode> listeEpisodes;
	
	public Saison() {
		this.listeEpisodes = new ArrayList<Episode>();
	}
	
	public void addEpisode(Episode episode) {
		this.listeEpisodes.add(episode);
	}

	public int getDureeTotale() {
		int rtrDuree = 0;
		for (int i = 0; i < this.listeEpisodes.size(); i++) {
			rtrDuree += this.listeEpisodes.get(i).getDuree();
		}
		return rtrDuree;
	}
	
	public int getNbEpisode() {
		return this.listeEpisodes.size();
	}

	public String toString() {
		String rtrString = "";
		for (int i = 0; i < this.listeEpisodes.size(); i++) {
			rtrString += this.listeEpisodes.get(i).toString() + "\n";
		}
		return rtrString;
	}
}
