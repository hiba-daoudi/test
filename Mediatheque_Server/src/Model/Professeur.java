package Model;

public class Professeur extends Client{

	private String CIN;
	
	public Professeur(String nom, String prenom, int age, String cin) {
		super(nom, prenom, age);
		this.CIN=cin;
		
	}

/*	private String Matiere;

	public String getMatiere() {
		return Matiere;
	}

	public void setMatiere(String matiere) {
		Matiere = matiere;
	}
*/
	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}
}
