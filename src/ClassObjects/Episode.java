package ClassObjects;
import java.io.Serializable;



public class Episode implements Serializable {

	private static final long serialVersionUID = 1855740869716533536L;
	private int numero;
	private int numeroSaison;
	private int duree;
	private String titre;
	
	public Episode(int numero, int numeroSaison, String titre, int duree) {
		this.numero = numero;
		this.numeroSaison = numeroSaison;
		this.duree = duree;
		this.titre = titre;
	}


	public int getDuree() {
		return duree;
	}

	public String toString() {
		return "S" + this.numeroSaison + "E" + this.numero + " : " + this.titre;
	}
}
