package td;

public class Developpeur {
	private String nom,prenom;
	private double salaire;
	private int exprience;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public int getExprience() {
		return exprience;
	}
	public void setExprience(int exprience) {
		this.exprience = exprience;
	}
	public Developpeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Developpeur(String nom, String prenom, double salaire, int exprience) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		this.exprience = exprience;
	}
	public String evaluateSalary()
	{
		if(this.salaire<2000)
			return "modeste";
		else if(this.salaire<=5000)
		// else if(this.salaire>=2000 && this.salaire <=5000)
			//=> >=2000 => unitile
		{
			return "acceptable";
		}
		else
			return "bon";
		
	}
	
public String TestExprience()
{
if(this.exprience<=2)
	return "novice";
else if(this.exprience<=4)
	return "junior";
else
	return "sénior";
}
@Override
public String toString() {
	return "Developpeur [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + ", exprience=" + exprience
			+ ", evaluateSalary()=" + evaluateSalary() + ", TestExprience()=" + TestExprience() + "]";
}
	

}
