package explication;

public class Test {
public static void main(String args[])
{
Voiture v; // la création de l'objet
v=new Voiture(); // instanciation
v.setMarque("toyota"); // encapsulation
v.setCouleur("bleu");
v.setPrix(42000);
System.out.println(v.getMarque()+" "+v.getCouleur()+" "+v.getPrix());
// affichage
Voiture v2=new Voiture("BMW", "noir", 72000);
System.out.println(v2.toString());

}
}
