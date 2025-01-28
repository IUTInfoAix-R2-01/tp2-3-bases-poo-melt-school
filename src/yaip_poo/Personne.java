package yaip_poo;

public class Personne {
	private String Nom;
	private String Prenom;
	
	Personne(String Nom, String Prenom) {
		this.Nom = Nom;
		this.Prenom = Prenom;
	}
	
	public String getPrenom() {
		return Prenom;
	}

	public String getNom() {
		return Nom;
	}
	
	public String toString() {
		return "Personne[Nom=" + this.Nom + ",Prenom=" + this.Prenom + "]";
	}
}
