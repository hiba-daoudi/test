package Model;
public abstract class Client {
	
	static private int idP=0;
	private String Nom;
	private String Prenom;
	private int Age;
	private int[] LesFavoris;
	
	public Client(String nom, String prenom, int age) {
		idP++;
		this.Nom=new String(nom);
		this.Prenom=new String(prenom);
		this.setAge(age);
	}
	
	public Client(Client P) {
		this.Nom=new String(P.getNom());
		this.Prenom=new String(P.getPrenom());
		this.Age=P.getAge();
	}
	
	
	public String toString() {
		String s="Le Nom : "+this.getNom()+"\n Le prenom : "+this.getPrenom()+"L'Age : "+this.getAge();
		return s;
	}
	
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}
}
