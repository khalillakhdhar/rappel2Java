package explication;

public class Voiture {
	// boilerplateCode= default constructor+ get/ set et attributs
private  String Marque,couleur;
private double prix;
public String getMarque() {
	return Marque;
}
public void setMarque(String marque) {
	Marque = marque;
}
public String getCouleur() {
	return couleur;
}
public void setCouleur(String couleur) {
	this.couleur = couleur;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public Voiture(String marque, String couleur, double prix) {
	super();
	Marque = marque;
	this.couleur = couleur;
	this.prix = prix;
}
public Voiture() {
	
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Voiture [Marque=" + Marque + ", couleur=" + couleur + ", prix=" + prix + "]";
}


}
